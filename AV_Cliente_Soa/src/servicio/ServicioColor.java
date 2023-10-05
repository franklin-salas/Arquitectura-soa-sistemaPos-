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
import utility.datos.Color;
import utility.datos.Diseno;

/**
 *
 * @author Franklin
 */
public class ServicioColor {
     private Gson gson;
    private ServiceSOA_Service service ;
    private ServiceSOA port ;

    public ServicioColor() {
        this.gson = new Gson();
        service = new ServiceSOA_Service();
        port = service.getServiceSOAPort();
    }
        
    public List<Color> listarColor(){
        String coloresJson = port.listarColor();
        java.lang.reflect.Type tipoColor = new TypeToken<List<Color>>() {
        }.getType();
        List<Color> listarColores = gson.fromJson(coloresJson, tipoColor);
        return listarColores;
    }
    
    public Mensaje Registrar(String codigo, String nombre, String imagen,String codBinario){
        String mensajeJson =   port.registarColor(codigo, nombre, imagen, codBinario);
        java.lang.reflect.Type tipoMensaje = new TypeToken<Mensaje>() {
        }.getType();
        Mensaje mensaje = gson.fromJson(mensajeJson, tipoMensaje);
        return mensaje;       
    }
    
    public Mensaje Modificar(String id, String codigo, String nombre, String imagen,String codBinario ){
        String mensajeJson =   port.editarColor(id, codigo, nombre, imagen, codBinario);
        java.lang.reflect.Type tipoMensaje = new TypeToken<Mensaje>() {
        }.getType();
        Mensaje mensaje = gson.fromJson(mensajeJson, tipoMensaje);
        return mensaje;       
    }
    
    public Mensaje Eliminar(String id){
        String mensajeJson =  port.eliminarColor(id);
        java.lang.reflect.Type tipoMensaje = new TypeToken<Mensaje>() {
        }.getType();
        Mensaje mensaje = gson.fromJson(mensajeJson, tipoMensaje);
        return mensaje;       
    }
    public Diseno buscar(String id){
        String disenoJson =  port.buscarColor(id);
        java.lang.reflect.Type tipoDiseno = new TypeToken<Almacen>() {
        }.getType();
        Diseno diseno = gson.fromJson(disenoJson, tipoDiseno);
        return diseno;       
    }    
}
