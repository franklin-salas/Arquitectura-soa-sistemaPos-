/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.util.EventListener;

/**
 *
 * @author Franklin
 */
public interface AddDatoEvent extends EventListener{
    
    abstract public void datoSelect(int origen, Object dato);
    
}
