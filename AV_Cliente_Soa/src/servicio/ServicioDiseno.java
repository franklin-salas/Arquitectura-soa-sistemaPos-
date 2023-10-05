/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import servicio.almacen.ServiceSOA;
import servicio.almacen.ServiceSOA_Service;
import utility.Mensaje;
import utility.datos.Almacen;
import utility.datos.Diseno;

/**
 *
 * @author Franklin
 */
public class ServicioDiseno {
    private Gson gson;
    private ServiceSOA_Service service ;
    private ServiceSOA port ;

    public ServicioDiseno() {
        this.gson = new Gson();
        service = new ServiceSOA_Service();
        port = service.getServiceSOAPort();
    }
        
    public List<Diseno> listarDiseno(){
        String disenosJson = port.listarDiseno();
        java.lang.reflect.Type tipoDiseno = new TypeToken<List<Diseno>>() {
        }.getType();
        List<Diseno> listarDiseno = gson.fromJson(disenosJson, tipoDiseno);
        return listarDiseno;
    }
    
    public Mensaje registrar(String nombre, String descripcion, String imagen){
        String mensajeJson =   port.registrarDiseno(nombre, descripcion, imagen);
        java.lang.reflect.Type tipoMensaje = new TypeToken<Mensaje>() {
        }.getType();
        Mensaje mensaje = gson.fromJson(mensajeJson, tipoMensaje);
        return mensaje;       
    }
    
    public Mensaje Modificar(String id,String nombre, String descripcion, String imagen ){
        String mensajeJson =   port.editarDiseno(id, nombre, descripcion, imagen);
        java.lang.reflect.Type tipoMensaje = new TypeToken<Mensaje>() {
        }.getType();
        Mensaje mensaje = gson.fromJson(mensajeJson, tipoMensaje);
        return mensaje;       
    }
    
    public Mensaje Eliminar(String id){
        String mensajeJson =  port.eliminarDiseno(id);
        java.lang.reflect.Type tipoMensaje = new TypeToken<Mensaje>() {
        }.getType();
        Mensaje mensaje = gson.fromJson(mensajeJson, tipoMensaje);
        return mensaje;       
    }
    public Diseno buscar(String id){
        String disenoJson =  port.buscarDiseno(id);
        java.lang.reflect.Type tipoDiseno = new TypeToken<Almacen>() {
        }.getType();
        Diseno diseno = gson.fromJson(disenoJson, tipoDiseno);
        return diseno;       
    }   
}
