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
public class Tela {
    private int id;
    private String codigo;
    private String marca;
    private float altura;
    private float precioDeVenta;
    private String tipoTela;
    private int id_diseno;

    public int getId_diseno() {
        return id_diseno;
    }

    public void setId_diseno(int id_diseno) {
        this.id_diseno = id_diseno;
    }

    public Tela() {
    }

    public Tela(String codigo, String marca, float altura, float precioDeVenta, String tipoTela) {
        this.codigo = codigo;
        this.marca = marca;
        this.altura = altura;
        this.precioDeVenta = precioDeVenta;
        this.tipoTela = tipoTela;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPrecioDeVenta() {
        return precioDeVenta;
    }

    public void setPrecioDeVenta(float precioDeVenta) {
        this.precioDeVenta = precioDeVenta;
    }

    public String getTipoTela() {
        return tipoTela;
    }

    public void setTipoTela(String tipoTela) {
        this.tipoTela = tipoTela;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.id;
        hash = 53 * hash + Objects.hashCode(this.codigo);
        hash = 53 * hash + Objects.hashCode(this.marca);
        hash = 53 * hash + Float.floatToIntBits(this.altura);
        hash = 53 * hash + Float.floatToIntBits(this.precioDeVenta);
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
        final Tela other = (Tela) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (Float.floatToIntBits(this.altura) != Float.floatToIntBits(other.altura)) {
            return false;
        }
        if (Float.floatToIntBits(this.precioDeVenta) != Float.floatToIntBits(other.precioDeVenta)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "00" + id + "::" + codigo + "::" + marca ;
    }
    
}
