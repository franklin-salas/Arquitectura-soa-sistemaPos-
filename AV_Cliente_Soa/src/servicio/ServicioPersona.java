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
import utility.datos.Persona;

/**
 *
 * @author Franklin
 */
public class ServicioPersona {
    private Gson gson;
    private ServiceSOA_Service service ;
    private ServiceSOA port ;

    public ServicioPersona() {
        this.gson = new Gson();
        service = new ServiceSOA_Service();
        port = service.getServiceSOAPort();
    }
 
    public Mensaje Registrar(String carnet ,String nombre, String apellidos, String direccion, String telefono,String empresa,String cargo,String tipo){
        String mensajeJson =   port.registrarPersona(carnet, nombre, apellidos, direccion, telefono, empresa, cargo, tipo);
        java.lang.reflect.Type tipoMensaje = new TypeToken<Mensaje>() {
        }.getType();
        Mensaje mensaje = gson.fromJson(mensajeJson, tipoMensaje);
        return mensaje;       
    }
    
    public Mensaje Modificar(String id, String carnet ,String nombre, String apellidos, String direccion, String telefono,String empresa,String cargo,String tipo){
        String mensajeJson =   port.editarPersona(id, carnet, nombre, apellidos, direccion, telefono, empresa, cargo, tipo);
        java.lang.reflect.Type tipoMensaje = new TypeToken<Mensaje>() {
        }.getType();
        Mensaje mensaje = gson.fromJson(mensajeJson, tipoMensaje);
        return mensaje;       
    }
    
    public Mensaje Eliminar(String id){
        String mensajeJson =   port.eliminarPersona(id);
        java.lang.reflect.Type tipoMensaje = new TypeToken<Mensaje>() {
        }.getType();
        Mensaje mensaje = gson.fromJson(mensajeJson, tipoMensaje);
        return mensaje;       
    }

    public List<Persona> listarPersonaCliente() {
        String clientesJson = port.listarPersonaCliente();
        java.lang.reflect.Type tipoPersona = new TypeToken<List<Persona>>() {
        }.getType();
        List<Persona> listarPersonas = gson.fromJson(clientesJson, tipoPersona);
        return listarPersonas;
    }
     public List<Persona> listarPersonaEmpleado() {
        String empleadosJson = port.listarPersonaEmpleado();
        java.lang.reflect.Type tipoPersona = new TypeToken<List<Persona>>() {
        }.getType();
        List<Persona> listarPersonas = gson.fromJson(empleadosJson, tipoPersona);
        return listarPersonas;
    }
    public List<Persona> listarPersonaProveedor() {
        String proveedoresJson = port.listarPersonaProveedor();
        java.lang.reflect.Type tipoPersona = new TypeToken<List<Persona>>() {
        }.getType();
        List<Persona> listarPersonas = gson.fromJson(proveedoresJson, tipoPersona);
        return listarPersonas;
    }
        
    public List<Persona> listarPersona() {
        String personaJson = port.listarPersona();
        java.lang.reflect.Type tipoPersona = new TypeToken<List<Persona>>() {
        }.getType();
        List<Persona> listarPersonas = gson.fromJson(personaJson, tipoPersona);
        return listarPersonas;
    }
    
    public Persona buscar(String id){
        String personaJson =   port.buscarAlmacen(id);
        java.lang.reflect.Type tipoPersona = new TypeToken<Persona>() {
        }.getType();
        Persona persona = gson.fromJson(personaJson, tipoPersona);
        return persona;       
    }
    
}
