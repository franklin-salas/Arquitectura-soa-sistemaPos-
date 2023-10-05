/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import servicio.almacen.ServiceSOA;
import servicio.almacen.ServiceSOA_Service;
import utility.Mensaje;
import utility.datos.Detalle;

/**
 *
 * @author Franklin
 */
public class ServicioNota {
    private Gson gson;
    private ServiceSOA_Service service ;
    private ServiceSOA port ;

    public ServicioNota() {
        this.gson = new Gson();
        service = new ServiceSOA_Service();
        port = service.getServiceSOAPort();
    }    
    
    public Mensaje Registrar(String codigo, String fecha, String codigoFactura, String observaciones,                 
        String tipo, String motivo, String id_almacen, String id_persona ){
        String mensajeJson =   port.registrarNota(codigo, fecha, codigoFactura, observaciones, tipo, motivo, id_almacen, id_persona);
        java.lang.reflect.Type tipoMensaje = new TypeToken<Mensaje>() {
        }.getType();
        Mensaje mensaje = gson.fromJson(mensajeJson, tipoMensaje);
        return mensaje;       
    }
    public boolean addDetalle (String metraje, String precio, String descripcion, String id_rollo){
        return  gson.fromJson(port.addDetalle(metraje, precio, descripcion, id_rollo),Boolean.class);
    }
    public Detalle getDetalle(String idRollo){
        
        return gson.fromJson(port.getDetalle(idRollo),Detalle.class);
    }

}
