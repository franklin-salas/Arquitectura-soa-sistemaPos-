/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import datos.Persona;
import java.util.LinkedList;
import java.util.List;
import utility.Mensaje;
import utility.TipoPersonal;

/**
 *
 * @author Franklin
 */
public class NPersona {
 private  Persona persona;

    public NPersona() {
    }
    
    public  Mensaje registrar(String carnet, String nombre, String apellidos, String direccion, String telefono, String empresa, String cargo, String tipo){
        persona = new Persona(carnet, nombre, apellidos, direccion, telefono, empresa, cargo, tipo);  
        return Mensaje.gestor_mensajes( persona.save(),Persona.class.getSimpleName(),"Registar");
    }
    public  Mensaje editar(String id, String carnet, String nombre, String apellidos, String direccion, String telefono, String empresa, String cargo, String tipo){
        int cod = Integer.parseInt(id);
        persona = persona.find(cod, ()->new Persona());
        persona.setCarnet(carnet);
        persona.setNombre(nombre);
        persona.setApellidos(apellidos);
        persona.setDireccion(direccion);
        persona.setTelefono(telefono);
        persona.setCargo(cargo);
        persona.setEmpresa(empresa);
        persona.setTipo(tipo);
        return Mensaje.gestor_mensajes( persona.update(),Persona.class.getSimpleName(),"Modificar");
    }
    public  Mensaje eliminar( String id){
        int cod = Integer.parseInt(id);
        persona = Persona.find(cod, ()->new Persona());
       return Mensaje.gestor_mensajes( persona.delete(),Persona.class.getSimpleName(),"Eliminar");
    }
    
    public  Persona buscarId(String id){
         int cod = Integer.parseInt(id);
         persona = Persona.find(cod, ()->new Persona());
    return persona ;
    }
    
    public  List<Persona> listarEmpleados(){
        List<Persona> listarEmpleado = new LinkedList<>();
        listarEmpleado = Persona.all(() -> new Persona(),TipoPersonal.P_EMP);
    return listarEmpleado;
    } 
    
    public  List<Persona> listarCliente(){
        List<Persona> listarCliente = new LinkedList<>();
        listarCliente = Persona.all(() -> new Persona(),TipoPersonal.P_CLI);
    return listarCliente;
    }  
    
    public  List<Persona> listarProveedor(){
        List<Persona> listarProveedor = new LinkedList<>();
        listarProveedor = Persona.all(() -> new Persona(),TipoPersonal.P_PRO);
    return listarProveedor;
    }  

    public  List<Persona> listarPersonas() {
        List<Persona> listarPersonas = new LinkedList<>();
        listarPersonas = Persona.all(() -> new Persona());
    return listarPersonas;   
    }
}
