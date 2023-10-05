/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.LinkedList;
import java.util.List;
import servicio.almacen.ServiceSOA;
import servicio.almacen.ServiceSOA_Service;
import utility.Mensaje;
import utility.datos.Almacen;
import utility.datos.Costo;
import utility.datos.Muestra;
import utility.datos.Tela;

/**
 *
 * @author Franklin
 */
public class ServicioTela {
    private Gson gson;
    private ServiceSOA_Service service ;
    private ServiceSOA port ;

    
    public ServicioTela() {
        this.gson = new Gson();
        service = new ServiceSOA_Service();
        port = service.getServiceSOAPort();
    }
        
    
    public Mensaje Registrar(String codigo, String marca, String altura, String precioDeVenta, String tipoTela, String id_diseno){
        String mensajeJson =   port.registrarTela(codigo, marca, altura, precioDeVenta, tipoTela, id_diseno);
        java.lang.reflect.Type tipoMensaje = new TypeToken<Mensaje>() {
        }.getType();
        Mensaje mensaje = gson.fromJson(mensajeJson, tipoMensaje);
        return mensaje;       
    }
    
    public Mensaje Modificar(String id, String codigo, String marca, String altura, String precioDeVenta, String tipoTela, String id_diseno){
        String mensajeJson =   port.editarTela(id, codigo, marca, altura, precioDeVenta, tipoTela, id_diseno);
        java.lang.reflect.Type tipoMensaje = new TypeToken<Mensaje>() {
        }.getType();
        Mensaje mensaje = gson.fromJson(mensajeJson, tipoMensaje);
        return mensaje;       
    }
    
    public Mensaje Eliminar(String id){
        String mensajeJson =  port.eliminarTela(id);
        java.lang.reflect.Type tipoMensaje = new TypeToken<Mensaje>() {
        }.getType();
        Mensaje mensaje = gson.fromJson(mensajeJson, tipoMensaje);
        return mensaje;       
    }
    
    public Tela buscar(String id){
        String telaJson =  port.buscarTela(id);
        java.lang.reflect.Type tipoTela = new TypeToken<Tela>() {
        }.getType();
        Tela tela = gson.fromJson(telaJson, tipoTela);
        return tela;       
    }
    
    public List<Tela> listarTelas() {
        String telasJson = port.listarTelas();
        java.lang.reflect.Type tipoTela = new TypeToken<List<Tela>>() {
        }.getType();
        List<Tela> listarTelas = gson.fromJson(telasJson, tipoTela);
        return listarTelas;
    }

    public List<Muestra> listarMuestras(String id) {       
        String muestrasJson = port.listarMuestra(id);
        java.lang.reflect.Type tipoMuestra = new TypeToken<List<Muestra>>() {
        }.getType();
        List<Muestra> listarMuestras = gson.fromJson(muestrasJson, tipoMuestra);
        return listarMuestras;
    }
    
        
    public List<Costo> listarCosto(String id) {       
        String costosJson = port.listarCosto(id);
        java.lang.reflect.Type tipoCosto = new TypeToken<List<Costo>>() {
        }.getType();
        List<Costo> listarCostos = gson.fromJson(costosJson, tipoCosto);
        return listarCostos;
    }
    
    public Mensaje addMuestra(String idTela, String idColor, String imagen){
        String mensajeJson =   port.addMuestra(idTela, idColor, imagen);
        java.lang.reflect.Type tipoMensaje = new TypeToken<Mensaje>() {
        }.getType();
        Mensaje mensaje = gson.fromJson(mensajeJson, tipoMensaje);
        return mensaje;      
    }
        
    public Mensaje addCosto(String idTela, String idProveedor, String precio){
        String mensajeJson =   port.addCosto(idTela, idProveedor, precio);
        java.lang.reflect.Type tipoMensaje = new TypeToken<Mensaje>() {
        }.getType();
        Mensaje mensaje = gson.fromJson(mensajeJson, tipoMensaje);
        return mensaje;      
    }
        
    public Mensaje EliminarMuestra(String id){
        String mensajeJson =  port.eliminarMuestra(id);
        java.lang.reflect.Type tipoMensaje = new TypeToken<Mensaje>() {
        }.getType();
        Mensaje mensaje = gson.fromJson(mensajeJson, tipoMensaje);
        return mensaje;
    }
        
    public Mensaje EliminarCosto(String id){
        String mensajeJson =  port.eliminarCosto(id);
        java.lang.reflect.Type tipoMensaje = new TypeToken<Mensaje>() {
        }.getType();
        Mensaje mensaje = gson.fromJson(mensajeJson, tipoMensaje);
        return mensaje;
    }
    
    
}
