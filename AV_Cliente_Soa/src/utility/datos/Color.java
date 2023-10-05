/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility.datos;

import java.util.Objects;


/**
 *
 * @author Franklin
 */
public class Color{
    private int id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.id;
        hash = 37 * hash + Objects.hashCode(this.codigo);
        hash = 37 * hash + Objects.hashCode(this.nombre);
        hash = 37 * hash + Objects.hashCode(this.imagen);
        hash = 37 * hash + Objects.hashCode(this.codBinario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Color other = (Color) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.imagen, other.imagen)) {
            return false;
        }
        if (!Objects.equals(this.codBinario, other.codBinario)) {
            return false;
        }
        return true;
    }

    public void setCodBinario(String codBinario) {
        this.codBinario = codBinario;
    } 

    @Override
    public String toString() {
        return "00"+ id + "::" + codigo + "::" + nombre ;
    }
    
}
