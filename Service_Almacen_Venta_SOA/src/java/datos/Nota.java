/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import datos.persistencia.Model;

/**
 *
 * @author Franklin
 */
public class Nota extends Model{
    private String codigo;
    private String fecha;
    private String codigoFactura;
    private int cantidadRollo;
    private float montoTotal;
    private String observaciones;
    private String tipo;
    private String motivo;
    private int id_almacen;
    private int id_persona;

    public Nota(String codigo, String fecha, String codigoFactura, int cantidadRollo, float montoTotal, String observaciones, String tipo, String motivo, int id_almacen, int id_persona) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.codigoFactura = codigoFactura;
        this.cantidadRollo = cantidadRollo;
        this.montoTotal = montoTotal;
        this.observaciones = observaciones;
        this.tipo = tipo;
        this.motivo = motivo;
        this.id_almacen = id_almacen;
        this.id_persona = id_persona;
    }

    public String getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }
    

    public int getId_almacen() {
        return id_almacen;
    }

    public void setId_almacen(int id_almacen) {
        this.id_almacen = id_almacen;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }
    

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Nota() {
    }
  

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCantidadRollo() {
        return cantidadRollo;
    }

    public void setCantidadRollo(int cantidadRollo) {
        this.cantidadRollo = cantidadRollo;
    }

    public float getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(float metrajeTotal) {
        this.montoTotal = metrajeTotal;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
