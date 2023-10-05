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
public class Detalle extends Model{
    private float metraje;
    private float precio;
    private String descripcion;
    private int id_rollo;
    private int id_nota;

    public Detalle(float metraje, float precio, String descripcion, int id_rollo, int id_nota) {
        this.metraje = metraje;
        this.precio = precio;
        this.descripcion = descripcion;
        this.id_rollo = id_rollo;
        this.id_nota = id_nota;
    }

    public int getId_rollo() {
        return id_rollo;
    }

    public void setId_rollo(int id_rollo) {
        this.id_rollo = id_rollo;
    }

    public int getId_nota() {
        return id_nota;
    }

    public void setId_nota(int id_nota) {
        this.id_nota = id_nota;
    }

    public Detalle() {
    }

    public Detalle(float metraje, float precio, String descripcion) {
        this.metraje = metraje;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public float getMetraje() {
        return metraje;
    }

    public void setMetraje(float metraje) {
        this.metraje = metraje;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
