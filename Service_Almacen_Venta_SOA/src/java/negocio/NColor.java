/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import datos.Color;
import java.util.LinkedList;
import java.util.List;
import utility.Mensaje;

/**
 *
 * @author Franklin
 */
public class NColor {
       private  Color color;

    public NColor() {
    }
    
    public  Mensaje registrar( String codigo,String nombre, String imagen, String codBinario){
        color = new Color(codigo, nombre, imagen, codBinario);
        return Mensaje.gestor_mensajes( color.save(),Color.class.getSimpleName(),"Registar");
    }
    public  Mensaje editar(String id, String codigo,String nombre, String imagen, String codBinario){
        int cod = Integer.parseInt(id);
        color = Color.find(cod, ()->new Color());
        color.setCodigo(codigo);
        color.setNombre(nombre);
        color.setImagen(imagen);
        color.setCodBinario(codBinario);
        return Mensaje.gestor_mensajes( color.update(),Color.class.getSimpleName(),"Modificar");
    }
    public  Mensaje eliminar( String id){
        int cod = Integer.parseInt(id);
        color = Color.find(cod, ()->new Color());
       return Mensaje.gestor_mensajes( color.delete(),Color.class.getSimpleName(),"Eliminar");
    }
    
    public  Color buscarId(String id){
         int cod = Integer.parseInt(id);
         color = Color.find(cod, ()->new Color());
    return color ;
    }
    
    public  List<Color> listar(){
        List<Color> listarColores = new LinkedList<>();
        listarColores = Color.all(() -> new Color());
    return listarColores;
    }     
}
