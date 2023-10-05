/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility.datos;



/**
 *
 * @author Franklin
 */
public class Rollo {
    private int id;
    private String codigo;
    private float metraje;
    private String estado;
    private Integer id_almacen;
    private int id_color;
    private int id_tela;

    public Rollo(String codigo, float metraje, String estado, Integer id_almacen, int id_color, int id_tela) {
        this.codigo = codigo;
        this.metraje = metraje;
        this.estado = estado;
        this.id_almacen = id_almacen;
        this.id_color = id_color;
        this.id_tela = id_tela;
    }

    public Rollo() {
        this.id_almacen = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getId_almacen() {
        return id_almacen;
    }

    public void setId_almacen(Integer id_almacen) {
        this.id_almacen = id_almacen;
    }

    public int getId_color() {
        return id_color;
    }

    public void setId_color(int id_color) {
        this.id_color = id_color;
    }

    public int getId_tela() {
        return id_tela;
    }

    public void setId_tela(int id_tela) {
        this.id_tela = id_tela;
    }

    
    public Rollo(float metraje, String estado) {
        this.metraje = metraje;
        this.estado = estado;
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public float getMetraje() {
        return metraje;
    }

    public void setMetraje(float metraje) {
        this.metraje = metraje;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
