/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

/**
 *
 * @author Franklin
 */

public class Mensaje {
    private String titulo;
    private String msj;
    public int ESTADO;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMsj() {
        return msj;
    }

    public void setMsj(String msj) {
        this.msj = msj;
    }
    
    private Mensaje(String titulo,String mensaje){
        this.titulo = titulo;
        this.msj = mensaje;
    }
    public static Mensaje mensaje_succes(String titulo,String mensaje){
        Mensaje m = new Mensaje(titulo,mensaje+" :: Se procedio éxito");
        m.ESTADO = EstadosMensaje.SUCCES;
        return  m;
    }
    public static Mensaje mensaje_error(String titulo,String mensaje){
        Mensaje m = new Mensaje(titulo,mensaje+" :: Se produjo un Error");
        m.ESTADO = EstadosMensaje.ERROR;
        return  m;
    }
    public static Mensaje mensaje_alert(String titulo,String mensaje){
        Mensaje m = new Mensaje(titulo,"Alerta :: "+mensaje);
        m.ESTADO = EstadosMensaje.ALERT;
        return  m;
    }
    public static Mensaje gestor_mensajes(boolean bandera,String titulo,String mensaje){
        Mensaje m = null;
        if (bandera) {
            m = mensaje_succes(titulo, mensaje);
        } else {
            m = mensaje_error(titulo, mensaje);
        }
        return m;
    }
}
