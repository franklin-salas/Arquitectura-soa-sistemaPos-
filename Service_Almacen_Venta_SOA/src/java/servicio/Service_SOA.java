/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import com.google.gson.Gson;
import datos.persistencia.Conector;
import datos.persistencia.ConfiguracionMySQL;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import negocio.NAlmacen;
import negocio.NColor;
import negocio.NDiseno;
import negocio.NNota;
import negocio.NPersona;
import negocio.NRollo;
import negocio.NTela;

/**
 *
 * @author Franklin
 */
@WebService(serviceName = "Service_SOA")
public class Service_SOA {

     private Gson gson;
     private NAlmacen nAlmacen;
     private NColor nColor;
     private NDiseno nDiseno;
     private NNota nnota;
     private NPersona nPersona;
     private NRollo nRollo;
     private NTela nTela;
     
    /**
     * This is a sample web service operation
     */
      
    public Service_SOA() {
        this.gson = new Gson();
        Conector c = Conector.getInstancia();
        c.setConfiguracionBD(new ConfiguracionMySQL());
        nAlmacen = new NAlmacen();
        nColor = new NColor();
        nDiseno = new NDiseno();
        nnota = new NNota();
        nPersona = new NPersona();
        nRollo = new NRollo();
        nTela = new NTela();

    }

    /**
     * Web service operation
     */
        
    @WebMethod(operationName = "registrarAlmacen")
    public String registroAlmacen(@WebParam(name = "codigo") String codigo, @WebParam(name = "descripcion") String descripcion, @WebParam(name = "direccion") String direccion) {
        //TODO write your implementation code here:
        return gson.toJson(nAlmacen.registrar(codigo, descripcion, direccion)); 
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "editarAlmacen")
    public String editarAlmacen(@WebParam(name = "id") String id, @WebParam(name = "codigo") String codigo, @WebParam(name = "descripcion") String descripcion, @WebParam(name = "direccion") String direccion) {
        //TODO write your implementation code here:        
        return gson.toJson(nAlmacen.editar(id, codigo, descripcion, direccion));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "buscarAlmacen")
    public String buscarAlmacen(@WebParam(name = "id") String id) {
        //TODO write your implementation code here:
        return gson.toJson(nAlmacen.buscarId(id));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "listarAlmacen")
    public String listarAlmacen() {
        //TODO write your implementation code here:
        return gson.toJson(nAlmacen.listar());
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarAlmacen")
    public String eliminarAlmacen(@WebParam(name = "id") String id) {
        //TODO write your implementation code here:
        return gson.toJson(nAlmacen.eliminar(id));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "registrarPersona")
    public String registrarPersona(@WebParam(name = "carnet") String carnet, @WebParam(name = "nombre") String nombre, @WebParam(name = "apellidos") String apellidos, @WebParam(name = "direccion") String direccion, @WebParam(name = "telefono") String telefono, @WebParam(name = "empresa") String empresa, @WebParam(name = "cargo") String cargo, @WebParam(name = "tipo") String tipo) {
        //TODO write your implementation code here:
        return gson.toJson(nPersona.registrar(carnet, nombre, apellidos, direccion, telefono, empresa, cargo, tipo));
    }
    
       @WebMethod(operationName = "editarPersona")
    public String editarPersona(@WebParam(name = "id") String id, @WebParam(name = "carnet") String carnet, @WebParam(name = "nombre") String nombre, @WebParam(name = "apellidos") String apellidos, @WebParam(name = "direccion") String direccion, @WebParam(name = "telefono") String telefono, @WebParam(name = "empresa") String empresa, @WebParam(name = "cargo") String cargo, @WebParam(name = "tipo") String tipo) {
        //TODO write your implementation code here:
        return gson.toJson(nPersona.editar(id, carnet, nombre, apellidos, direccion, telefono, empresa, cargo, tipo));
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarPersona")
    public String eliminarPersona(@WebParam(name = "id") String id) {
        //TODO write your implementation code here:
        return gson.toJson(nPersona.eliminar(id));
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "buscarPersona")
    public String buscarPersona(@WebParam(name = "id") String id) {
        //TODO write your implementation code here:
        return gson.toJson(nPersona.buscarId(id));
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "listarPersonaEmpleado")
    public String listarPersonaEmpleado() {
        //TODO write your implementation code here:
        return gson.toJson(nPersona.listarEmpleados());
    }
        
    /**
     * Web service operation
     */
    @WebMethod(operationName = "listarPersonaCliente")
    public String listarPersonaCliente() {
        //TODO write your implementation code here:
        return gson.toJson(nPersona.listarCliente());
    } 
        
    /**
     * Web service operation
     */
    @WebMethod(operationName = "listarPersonaProveedor")
    public String listarPersonaProveedor() {
        //TODO write your implementation code here:
        return gson.toJson(nPersona.listarProveedor());
    } 
        
    /**
     * Web service operation
     */
    @WebMethod(operationName = "listarPersona")
    public String listarPersona() {
        //TODO write your implementation code here:
        return gson.toJson(nPersona.listarPersonas());
    } 
    /**
     * Web service operation
     */
    @WebMethod(operationName = "registrarDiseno")
    public String registrarDiseno(@WebParam(name = "nombre") String nombre, @WebParam(name = "descripcion") String descripcion, @WebParam(name = "imagen") String imagen) {
        //TODO write your implementation code here:
        return gson.toJson(nDiseno.registrar(nombre, descripcion, imagen));
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "editarDiseno")
    public String editarDiseno(@WebParam(name = "id") String id,@WebParam(name = "nombre") String nombre, @WebParam(name = "descripcion") String descripcion, @WebParam(name = "imagen") String imagen) {
        //TODO write your implementation code here:
        return gson.toJson(nDiseno.editar(id, nombre, descripcion, imagen));
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "buscarDiseno")
    public String buscarDiseno(@WebParam(name = "id") String id) {
        //TODO write your implementation code here:
        return gson.toJson(nDiseno.buscarId(id));
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarDiseno")
    public String eliminarDiseno(@WebParam(name = "id") String id) {
        //TODO write your implementation code here:
        return gson.toJson(nDiseno.eliminar(id));
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "listarDiseno")
    public String listarDiseno() {
        //TODO write your implementation code here:
        return gson.toJson(nDiseno.listar());
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "registarColor")
    public String registarColor(@WebParam(name = "codigo") String codigo, @WebParam(name = "nombre") String nombre, @WebParam(name = "imagen") String imagen, @WebParam(name = "codBinario") String codBinario) {
        //TODO write your implementation code here:
        return gson.toJson(nColor.registrar(codigo, nombre, imagen, codBinario));
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "editarColor")
    public String editarColor(@WebParam(name = "id") String id, @WebParam(name = "codigo") String codigo, @WebParam(name = "nombre") String nombre, @WebParam(name = "imagen") String imagen, @WebParam(name = "codBinario") String codBinario) {
        //TODO write your implementation code here:
        return gson.toJson(nColor.editar(id, codigo, nombre, imagen, codBinario));
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "buscarColor")
    public String buscarColor(@WebParam(name = "id") String id) {
        //TODO write your implementation code here:
        return gson.toJson(nColor.buscarId(id));
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarColor")
    public String eliminarColor(@WebParam(name = "id") String id) {
        //TODO write your implementation code here:
        return gson.toJson(nColor.eliminar(id));
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "listarColor")
    public String listarColor() {
        //TODO write your implementation code here:
        return gson.toJson(nColor.listar());
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "registrarTela")
    public String registrarTela(@WebParam(name = "codigo") String codigo, @WebParam(name = "marca") String marca, @WebParam(name = "altura") String altura, @WebParam(name = "precioDeVenta") String precioDeVenta, @WebParam(name = "tipoTela") String tipoTela, @WebParam(name = "id_diseno") String id_diseno) {
        //TODO write your implementation code here:
        return gson.toJson(nTela.registrar(codigo, marca, altura, precioDeVenta, tipoTela,id_diseno));
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "editarTela")
    public String editarTela(@WebParam(name = "id") String id, @WebParam(name = "codigo") String codigo, @WebParam(name = "marca") String marca, @WebParam(name = "altura") String altura, @WebParam(name = "precioDeVenta") String precioDeVenta, @WebParam(name = "tipoTela") String tipoTela, @WebParam(name = "id_diseno") String id_diseno) {
        //TODO write your implementation code here:
        return gson.toJson(nTela.editar(id, codigo, marca, altura, precioDeVenta, tipoTela,id_diseno));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addCosto")
    public String addCosto(@WebParam(name = "id_tela") String id_tela, @WebParam(name = "id_proveedor") String id_proveedor, @WebParam(name = "precio") String precio) {
        //TODO write your implementation code here:
        return gson.toJson(nTela.addCosto(id_tela, id_proveedor, precio));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addMuestra")
    public String addMuestra(@WebParam(name = "id_tela") String id_tela, @WebParam(name = "id_color") String id_color, @WebParam(name = "imagen") String imagen) {
        //TODO write your implementation code here:
        return gson.toJson(nTela.addMuestra(id_tela, id_color, imagen));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarCosto")
    public String eliminarCosto(@WebParam(name = "id") String id) {
        //TODO write your implementation code here:
        return gson.toJson(nTela.eliminarCosto(id));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarMuestra")
    public String eliminarMuestra(@WebParam(name = "id") String id) {
        //TODO write your implementation code here:
        return gson.toJson(nTela.eliminarMuestra(id));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarTela")
    public String eliminarTela(@WebParam(name = "id") String id) {
        //TODO write your implementation code here:
        return gson.toJson(nTela.eliminar(id));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "listarCosto")
    public String listarCosto(@WebParam(name = "id_tela") String id_tela) {
        //TODO write your implementation code here:
        return gson.toJson(nTela.listarCosto(id_tela));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "listarMuestra")
    public String listarMuestra(@WebParam(name = "id_tela") String id_tela) {
        //TODO write your implementation code here:
        return gson.toJson(nTela.listarMuestra(id_tela));
    }
        
    /**
     * Web service operation
     */
    @WebMethod(operationName = "listarTelas")
    public String listarTelas() {
        //TODO write your implementation code here:
        return gson.toJson(nTela.listar());
    }
        
    /**
     * Web service operation
     */
    @WebMethod(operationName = "buscarTela")
    public String buscarTela(@WebParam(name = "id") String id) {
        //TODO write your implementation code here:
        return gson.toJson(nTela.buscarId(id));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "registrarRollo")
    public String registrarRollo(@WebParam(name = "codigo") String codigo, @WebParam(name = "metraje") String metraje, @WebParam(name = "estado") String estado, @WebParam(name = "id_almacen") String id_almacen, @WebParam(name = "id_color") String id_color, @WebParam(name = "id_tela") String id_tela) {
        //TODO write your implementation code here:
        return gson.toJson(nRollo.registrar(codigo, metraje, estado, id_almacen, id_color, id_tela));
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "editarRollo")
    public String editarRollo(@WebParam(name = "id") String id, @WebParam(name = "codigo") String codigo, @WebParam(name = "metraje") String metraje, @WebParam(name = "estado") String estado, @WebParam(name = "id_almacen") String id_almacen, @WebParam(name = "id_color") String id_color, @WebParam(name = "id_tela") String id_tela) {
        //TODO write your implementation code here:
        return gson.toJson(nRollo.editar(id, codigo, metraje, estado, id_almacen, id_color, id_tela));
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "buscarRollo")
    public String buscarRollo(@WebParam(name = "id") String id) {
        //TODO write your implementation code here:
        return gson.toJson(nRollo.buscarId(id));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "listarRollo")
    public String listarRollo() {
        //TODO write your implementation code here:
        return gson.toJson(nRollo.listar());
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminarRollo")
    public String eliminarRollo(@WebParam(name = "id") String id) {
        //TODO write your implementation code here:
        return gson.toJson(nRollo.eliminar(id));
    }
//"String codigo, String fecha, String codigoFactura, String observaciones,\n" +
//"                  String tipo, String motivo, String id_almacen, String id_persona"

    /**
     * Web service operation
     */
    @WebMethod(operationName = "registrarNota")
    public String registrarNota(@WebParam(name = "codigo") String codigo, @WebParam(name = "fecha") String fecha, @WebParam(name = "codFactura") String codFactura, @WebParam(name = "observaciones") String observaciones,
            @WebParam(name = "tipo") String tipo, @WebParam(name = "motivo") String motivo, @WebParam(name = "id_almacen") String id_almacen, @WebParam(name = "id_persona") String id_persona) {
        //TODO write your implementation code here:
        return gson.toJson(nnota.registrar(codigo, fecha, codFactura, observaciones, tipo, motivo, id_almacen, id_persona));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addDetalle")
    public String addDetalle(@WebParam(name = "metraje") String metraje, @WebParam(name = "precio") String precio, @WebParam(name = "descripcion") String descripcion, @WebParam(name = "id_rollo") String id_rollo) {
        //TODO write your implementation code here:
        return gson.toJson(nnota.addDetalle(metraje, precio, descripcion, id_rollo));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getDetalle")
    public String getDetalle(@WebParam(name = "idRollo") String idRollo) {
        //TODO write your implementation code here:
        return gson.toJson(nnota.getDetalle(idRollo));
    }




}
