/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import datos.Detalle;
import datos.Nota;
import datos.Rollo;
import datos.Tela;
import java.util.LinkedList;
import java.util.List;
import utility.EstadoRollo;
import utility.Mensaje;
import utility.TipoNota;


/**
 *
 * @author Franklin
 */
public class NNota {
    private  Nota nota;
    private List<Detalle> detalles;

    public NNota() {
        this.detalles = new LinkedList<>();
    }
    
    public  Mensaje registrar( String codigo, String fecha, String codigoFactura, String observaciones,
                  String tipo, String motivo, String id_almacen, String id_persona){
        
        int cantidadRollo = detalles.size();
        float montoTotal = 0;
        int idAlmacen = Integer.valueOf(id_almacen);
         String estadoRollo = EstadoRollo.R_A;
         if (null != tipo) switch (tipo) {
            case TipoNota.N_VEN:
                idAlmacen = -1;
                estadoRollo = EstadoRollo.R_V;
                break;
            case TipoNota.N_SAL:
                estadoRollo = EstadoRollo.R_NA;
                idAlmacen = 0;
                break;
        }else if(!TipoNota.N_ENT.equals(tipo)){
        return Mensaje.mensaje_alert(Nota.class.getSimpleName(),"Registar :: TIPO_NOTA - Incorrecto");   
        }    
         nota = new Nota(codigo, fecha, codigoFactura, cantidadRollo, montoTotal, observaciones,
                        tipo, motivo,idAlmacen, Integer.valueOf(id_persona));
         nota.save();
         int id = nota.final_Id();
        for (Detalle detalle : detalles) {
         montoTotal = montoTotal + detalle.getPrecio();
         detalle.setId_nota(id);
         detalle.save();
         Rollo r = Rollo.find(detalle.getId_rollo(), ()-> new Rollo());
         r.setEstado(estadoRollo);
         r.setId_almacen(idAlmacen);
        }
        nota = Nota.find(id,()-> new Nota());
        nota.setMontoTotal(montoTotal);
        
        return Mensaje.gestor_mensajes( nota.update(),Nota.class.getSimpleName(),"Registar");
    }
    public boolean addDetalle(String metraje, String precio, String descripcion, String id_rollo){
        Detalle detalle = new Detalle(Float.valueOf(metraje), Float.valueOf(precio), descripcion, Integer.valueOf(id_rollo), -1);
        detalles.add(detalle);
        return true;
    }
    public Detalle getDetalle(String idRollo){
        int idr = Integer.valueOf(idRollo);
        Rollo r = Rollo.find(idr,()->new Rollo());
        Tela t = Tela.find(r.getId_tela(), ()->new Tela());
        float precio = r.getMetraje() * t.getPrecioDeVenta();
        return new Detalle(r.getMetraje(), precio, "", idr, 0);
    }
    
  
    
}
