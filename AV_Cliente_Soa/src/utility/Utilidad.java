/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Franklin
 */
public class Utilidad {
   
    public static String generarFecha(){
        DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
         return hourdateFormat.format(new Date());
    }
    public static String codeGenerate(){
       String code= "BQ-"+System.currentTimeMillis();       
        return code;
    }
}
