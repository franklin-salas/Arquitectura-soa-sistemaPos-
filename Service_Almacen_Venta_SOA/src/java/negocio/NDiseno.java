/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;


import datos.Diseno;
import java.util.LinkedList;
import java.util.List;
import utility.Mensaje;

/**
 *
 * @author Franklin
 */
public class NDiseno {
    private  Diseno diseno;

    public NDiseno() {
    }
    
    public  Mensaje registrar( String nombre, String descripcion, String imagen){
        diseno = new Diseno(nombre, descripcion, imagen);  
        return Mensaje.gestor_mensajes( diseno.save(),"Diseño","Registar");
    }
    public  Mensaje editar(String id, String nombre, String descripcion, String imagen){
        int cod = Integer.parseInt(id);
        diseno = Diseno.find(cod, ()->new Diseno());
        diseno.setNombre(nombre);
        diseno.setDescripcion(descripcion);
        diseno.setImagen(imagen);
        return Mensaje.gestor_mensajes( diseno.update(),"Diseño","Modificar");
    }
    public  Mensaje eliminar( String id){
        int cod = Integer.parseInt(id);
        diseno = Diseno.find(cod, ()->new Diseno());
       return Mensaje.gestor_mensajes( diseno.delete(),"Diseño","Eliminar");
    }
    
    public  Diseno buscarId(String id){
         int cod = Integer.parseInt(id);
         diseno = Diseno.find(cod, ()->new Diseno());
    return diseno ;
    }
    
    public  List<Diseno> listar(){
        List<Diseno> listarDiseno = new LinkedList<>();
        listarDiseno = Diseno.all(() -> new Diseno());
    return listarDiseno;
    }    
}
