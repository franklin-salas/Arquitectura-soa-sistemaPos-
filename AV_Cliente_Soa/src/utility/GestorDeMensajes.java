/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.awt.Component;
import javax.swing.JOptionPane;



/**
 *
 * @author Franklin
 */
public class GestorDeMensajes {
    
    public static void mostraMensaje(Component parentComponent, Mensaje mensaje){
         JOptionPane.showMessageDialog(parentComponent,mensaje.getMsj(),mensaje.getTitulo(),mensaje.ESTADO);
    }
    
}
