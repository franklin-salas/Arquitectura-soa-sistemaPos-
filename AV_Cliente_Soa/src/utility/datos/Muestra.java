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
public class Muestra {
    private int id;
    private String imagen;
    private int id_tela;
    private int id_color;

    public Muestra() {
    }

    public Muestra(int id, String imagen, int id_tela, int id_color) {
        this.id = id;
        this.imagen = imagen;
        this.id_tela = id_tela;
        this.id_color = id_color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    public void setId_tela(int id_tela) {
           this.id_tela = id_tela;
    }

    public void setId_color(int id_color) {
        this.id_color = id_color;
    }

    public int getId_tela() {
        return this.id_tela;
    }

    public int getId_color() {
        return this.id_color;
    }
    
}
