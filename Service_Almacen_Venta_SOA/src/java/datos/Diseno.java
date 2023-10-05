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
public class Diseno extends Model{
    private String nombre;
    private String descripcion;
    private String imagen;

    public Diseno() {
    }

    public Diseno(String nombre, String descripcion, String imagen) {
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.imagen = imagen;
    }

  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
}
