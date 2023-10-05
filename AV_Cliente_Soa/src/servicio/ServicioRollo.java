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
import utility.datos.Rollo;
import utility.datos.Tela;

/**
 *
 * @author Franklin
 */
public class ServicioRollo {
   private Gson gson;
    private ServiceSOA_Service service ;
    private ServiceSOA port ;

    public ServicioRollo() {
        this.gson = new Gson();
        service = new ServiceSOA_Service();
        port = service.getServiceSOAPort();
    }
        
    public List<Rollo> listarRollo(){
        String rollosJson = port.listarRollo();
        java.lang.reflect.Type tipoRollo = new TypeToken<List<Rollo>>() {
        }.getType();
        List<Rollo> listarrollos = gson.fromJson(rollosJson, tipoRollo);
        return listarrollos;
    }
    
    public Mensaje Registrar(String codigo, String metraje, String estado, String id_almacen, String id_color, String id_tela){
        String mensajeJson =   port.registrarRollo(codigo, metraje, estado, id_almacen, id_color, id_tela);
        java.lang.reflect.Type tipoMensaje = new TypeToken<Mensaje>() {
        }.getType();
        Mensaje mensaje = gson.fromJson(mensajeJson, tipoMensaje);
        return mensaje;       
    }
    
    public Mensaje Modificar(String id, String codigo, String metraje, String estado, String id_almacen, String id_color, String id_tela ){
        String mensajeJson =   port.editarRollo(id, codigo, metraje, estado, id_almacen, id_color, id_tela);
        java.lang.reflect.Type tipoMensaje = new TypeToken<Mensaje>() {
        }.getType();
        Mensaje mensaje = gson.fromJson(mensajeJson, tipoMensaje);
        return mensaje;       
    }
    
    public Mensaje Eliminar(String id){
        String mensajeJson =  port.eliminarRollo(id);
        java.lang.reflect.Type tipoMensaje = new TypeToken<Mensaje>() {
        }.getType();
        Mensaje mensaje = gson.fromJson(mensajeJson, tipoMensaje);
        return mensaje;       
    }
    public Rollo buscar(String id){
        String rolloJson =  port.buscarRollo(id);
        java.lang.reflect.Type tipoRollo = new TypeToken<Rollo>() {
        }.getType();
        Rollo rollo = gson.fromJson(rolloJson, tipoRollo);
        return rollo;       
    }
    public float precioRollo(String id){
        String telaJson = port.buscarTela(id);
       java.lang.reflect.Type tipoTela = new TypeToken<Tela>() {
        }.getType();
        Tela t = gson.fromJson(telaJson, tipoTela);
        return t.getPrecioDeVenta();
    }
}
