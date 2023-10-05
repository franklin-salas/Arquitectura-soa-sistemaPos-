/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import utility.Mensaje;
import utility.datos.Almacen;
import servicio.almacen.ServiceSOA_Service ;
import servicio.almacen.ServiceSOA;

/**
 *
 * @author Franklin
 */
public class ServicioAlmacen {
    private Gson gson;
    private ServiceSOA_Service service ;
    private ServiceSOA port ;

    public ServicioAlmacen() {
        this.gson = new Gson();
        service = new ServiceSOA_Service();
        port = service.getServiceSOAPort();
    }
        
    public List<Almacen> listarAlmacen(){
        String almacenesJson = port.listarAlmacen();
        java.lang.reflect.Type tipoAlmacen = new TypeToken<List<Almacen>>() {
        }.getType();
        List<Almacen> listarAlmacen = gson.fromJson(almacenesJson, tipoAlmacen);
        return listarAlmacen;
    }
    
    public Mensaje Registrar(String codigo, String descripcion, String direccion ){
        String mensajeJson =   port.registrarAlmacen(codigo, descripcion, direccion);
        java.lang.reflect.Type tipoMensaje = new TypeToken<Mensaje>() {
        }.getType();
        Mensaje mensaje = gson.fromJson(mensajeJson, tipoMensaje);
        return mensaje;       
    }
    
    public Mensaje Modificar(String id, String codigo, String descripcion, String direccion ){
        String mensajeJson =   port.editarAlmacen(id, codigo, descripcion, direccion);
        java.lang.reflect.Type tipoMensaje = new TypeToken<Mensaje>() {
        }.getType();
        Mensaje mensaje = gson.fromJson(mensajeJson, tipoMensaje);
        return mensaje;       
    }
    
    public Mensaje Eliminar(String id){
        String mensajeJson =  port.eliminarAlmacen(id);
        java.lang.reflect.Type tipoMensaje = new TypeToken<Mensaje>() {
        }.getType();
        Mensaje mensaje = gson.fromJson(mensajeJson, tipoMensaje);
        return mensaje;       
    }
    public Almacen buscar(String id){
        String almacenJson =  port.buscarAlmacen(id);
        java.lang.reflect.Type tipoAlmacen = new TypeToken<Almacen>() {
        }.getType();
        Almacen almacen = gson.fromJson(almacenJson, tipoAlmacen);
        return almacen;       
    }
    
    
    
    
    
    
}
