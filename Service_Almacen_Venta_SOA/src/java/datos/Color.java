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
public class Color extends Model{
    private String codigo;
    private String nombre;
    private String imagen;
    private String codBinario;

    public Color() {
    }   
    public Color(String codigo, String nombre, String imagen,String codBinario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.imagen = imagen;
        this.codBinario = codBinario;
        
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    public String getCodBinario() {
        return codBinario;
    }

    public void setCodBinario(String codBinario) {
        this.codBinario = codBinario;
    } 
}
