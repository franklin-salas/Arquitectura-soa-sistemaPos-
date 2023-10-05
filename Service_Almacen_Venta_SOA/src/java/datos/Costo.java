/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import datos.persistencia.Conector;
import datos.persistencia.Field;
import datos.persistencia.Model;
import datos.persistencia.Utility;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Franklin
 */
public class Costo extends Model{   
    private int id_persona;
    private int id_tela;
    private float precio;

    public Costo() {
    }
    
    public Costo(int id_persona, int id_tela, float precio) {
        this.id_persona = id_persona;
        this.id_tela = id_tela;
        this.precio = precio;
    }  

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public int getId_tela() {
        return id_tela;
    }

    public void setId_tela(int id_tela) {
        this.id_tela = id_tela;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public static <M extends Model> List<M> all(Supplier<M> constructor, int id_tela)  {
        M instance = constructor.get();
        List<M> models = new ArrayList<>();
        Method[] methods = instance.getClass().getDeclaredMethods();
        List<Method> setters = new ArrayList<>();
        List<Field> fields = Utility.getFields(methods, instance, true);
        Conector connector = Conector.getInstancia();

        for (Method m : methods) {
            if (m.getName().contains("set")) {
                setters.add(m);
            }
        }

        String sql = "SELECT * FROM " + Utility.tableOf(instance) + " WHERE id_tela = " +id_tela;
        try {
            ResultSet rs = connector.ejecutarQuery(sql);

            while (rs.next()) {
                M model = constructor.get();
                model.setId(rs.getInt("id"));

                for (int i = 0; i < setters.size(); i++) {
                    Method tempMethod = setters.get(i);
                    for (int j = 0; j < fields.size(); j++) {
                        Field tempField = fields.get(j);
                        if (tempMethod.getName().toLowerCase().contains(tempField.getNombre())) {
                            tempMethod.invoke(model, connector.getResult(rs, tempField.getTipo(), tempField.getNombre()));
                        }
                    }
                }
                models.add(model);
            }
        } catch (SQLException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, "Failed to execute query", e);
            return null;
        }  
        
        System.out.println(sql);

        return models;
    }
}
