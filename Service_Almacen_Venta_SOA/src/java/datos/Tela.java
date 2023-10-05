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
public class Tela extends Model{
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

    public Tela(String codigo, String marca, float altura, float precioDeVenta, String tipoTela, int id_diseno) {
        this.codigo = codigo;
        this.marca = marca;
        this.altura = altura;
        this.precioDeVenta = precioDeVenta;
        this.tipoTela = tipoTela;
        this.id_diseno = id_diseno;
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
    
}
