/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import datos.Almacen;
import java.util.LinkedList;
import java.util.List;
import utility.Mensaje;

/**
 *
 * @author Franklin
 */
public class NAlmacen {
    private  Almacen almacen;

    public NAlmacen() {
    }
    
    
    public  Mensaje registrar( String codigo, String descripcion, String direccion){
        almacen = new Almacen(codigo, descripcion, direccion);  
        return Mensaje.gestor_mensajes( almacen.save(),Almacen.class.getSimpleName(),"Registar");
    }
    public  Mensaje editar(String id, String codigo, String descripcion, String direccion){
        int cod = Integer.parseInt(id);
        almacen = Almacen.find(cod, ()->new Almacen());
        almacen.setCodigo(codigo);
        almacen.setDescripcion(descripcion);
        almacen.setDireccion(direccion);
        return Mensaje.gestor_mensajes( almacen.update(),Almacen.class.getSimpleName(),"Modificar");
    }
    public  Mensaje eliminar( String id){
        int cod = Integer.parseInt(id);
        almacen = Almacen.find(cod, ()->new Almacen());
       return Mensaje.gestor_mensajes( almacen.delete(),Almacen.class.getSimpleName(),"Eliminar");
    }
    
    public  Almacen buscarId(String id){
         int cod = Integer.parseInt(id);
         almacen = Almacen.find(cod, ()->new Almacen());
    return almacen ;
    }
    
    public  List<Almacen> listar(){
        List<Almacen> listarAlmacen = new LinkedList<>();
        listarAlmacen = Almacen.all(() -> new Almacen());
    return listarAlmacen;
    }  
    
}
