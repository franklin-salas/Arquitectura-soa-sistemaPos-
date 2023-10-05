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
public class Costo{
    private int id;
    private int id_persona;
    private int id_tela;
    private float precio;

    public Costo() {
    }
    
    public Costo(int id_persona, int id_tela, float precio) {
        this.id_persona = id_persona;
        this.id_tela = id_tela;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public int getId_tela() {
        return id_tela;
    }

    public void setId_tela(int id_tipoTela) {
        this.id_tela = id_tipoTela;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
}
