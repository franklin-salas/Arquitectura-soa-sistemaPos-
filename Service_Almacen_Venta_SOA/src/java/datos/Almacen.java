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
public class Almacen extends Model{
    private String codigo;
    private String descripcion;
    private String direccion;

    public Almacen() {
    }

    public Almacen(String codigo, String descripcion, String direccion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.direccion = direccion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    

}
