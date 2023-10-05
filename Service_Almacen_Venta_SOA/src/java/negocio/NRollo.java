/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import datos.Almacen;
import datos.Rollo;
import java.util.LinkedList;
import java.util.List;
import utility.Mensaje;

/**
 *
 * @author Franklin
 */
public class NRollo {
      private  Rollo rollo;

    public NRollo() {
    }
    
    public  Mensaje registrar(String codigo, String metraje, String estado, String id_almacen, String id_color, String id_tela){
        rollo = new Rollo(codigo,Float.valueOf(metraje), estado,Integer.valueOf(id_almacen), Integer.valueOf(id_color), Integer.valueOf(id_tela));  
        return Mensaje.gestor_mensajes( rollo.save(),Almacen.class.getSimpleName(),"Registar");
    }
    public  Mensaje editar(String id, String codigo, String metraje, String estado, String id_almacen, String id_color, String id_tela){
        int cod = Integer.parseInt(id);
        rollo = Rollo.find(cod, ()->new Rollo());
        rollo.setCodigo(codigo);
        rollo.setMetraje(Float.valueOf(metraje));
        rollo.setEstado(estado);
        rollo.setId_almacen(Integer.valueOf(id_almacen));
        rollo.setId_color(Integer.valueOf(id_color));
        rollo.setId_tela(Integer.valueOf(id_tela));
        return Mensaje.gestor_mensajes( rollo.update(),Rollo.class.getSimpleName(),"Modificar");
    }
    
    public  Mensaje eliminar( String id){
        int cod = Integer.parseInt(id);
        rollo = Rollo.find(cod, ()->new Rollo());
       return Mensaje.gestor_mensajes( rollo.delete(),Almacen.class.getSimpleName(),"Eliminar");
    }
    
    public  Rollo buscarId(String id){
         int cod = Integer.parseInt(id);
         rollo = Rollo.find(cod, ()->new Rollo());
    return rollo ;
    }
    
    public  List<Rollo> listar(){
        List<Rollo> listarRollos = new LinkedList<>();
        listarRollos = Rollo.all(() -> new Rollo());
    return listarRollos;
    }  
}
