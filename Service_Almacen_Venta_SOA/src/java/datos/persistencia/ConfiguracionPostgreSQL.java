/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos.persistencia;

import datos.persistencia.ConfiguracionBD;
import datos.persistencia.TipoBD;

/**
 *
 * @author Franklin
 */
public class ConfiguracionPostgreSQL implements ConfiguracionBD{

    @Override
    public TipoBD getTipoBD() {
        return TipoBD.POSTGRE;
    }

    @Override
    public String getNombreDeHost() {
    
        return "localhost";
    }

    @Override
    public String getNumeroDePuerto() {
        return "5432";
    }

    @Override
    public String getNombreDeBaseDeDato() {
        return "almacen_ventas?zeroDateTimeBehavior=convertToNull";
    }

    @Override
    public String getNombreDeUsuario() {
        return "root";
    }

    @Override
    public String getPassword() {
        return "";
    }
    
}
