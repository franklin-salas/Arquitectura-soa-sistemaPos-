/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import datos.Costo;
import datos.Muestra;
import datos.Tela;
import java.util.LinkedList;
import java.util.List;
import utility.Mensaje;

/**
 *
 * @author Franklin
 */
public class NTela {
    private  Tela tela;
    private  Muestra muestra;
    private  Costo costo;

    public NTela() {
    }
    
    public  Mensaje registrar(String codigo, String marca, String altura, String precioDeVenta, String tipoTela, String id_diseno){
        tela = new Tela(codigo, marca,Float.valueOf(altura),Float.valueOf(precioDeVenta), tipoTela, Integer.parseInt(id_diseno));  
        return Mensaje.gestor_mensajes( tela.save(),Tela.class.getSimpleName(),"Registar");
    }
    public  Mensaje editar(String id, String codigo, String marca, String altura, String precioDeVenta, String tipoTela, String id_diseno){
        int cod = Integer.parseInt(id);
        tela = Tela.find(cod, ()->new Tela());
        tela.setCodigo(codigo);
        tela.setMarca(marca);
        tela.setAltura(Float.valueOf(altura));
        tela.setPrecioDeVenta(Float.valueOf(precioDeVenta));
        tela.setTipoTela(tipoTela);
        tela.setId_diseno(Integer.parseInt(id_diseno));
        return Mensaje.gestor_mensajes( tela.update(),Tela.class.getSimpleName(),"Modificar");
    }
    public  Mensaje eliminar( String id){
        int cod = Integer.parseInt(id);
        tela = Tela.find(cod, ()->new Tela());
       return Mensaje.gestor_mensajes( tela.delete(),Tela.class.getSimpleName(),"Eliminar");
    }
    
    public  Tela buscarId(String id){
         int cod = Integer.parseInt(id);
         tela = Tela.find(cod, ()->new Tela());
    return tela ;
    }
    
    public  List<Tela> listar(){
        List<Tela> listarTelas = new LinkedList<>();
        listarTelas = Tela.all(() -> new Tela());
    return listarTelas;
    }  
      
    public  Mensaje addCosto(String id_tela, String id_proveedor, String precio ){
        int id_p = Integer.parseInt(id_proveedor);
        int id_t = Integer.parseInt(id_tela);
        float p = Float.valueOf(precio);
        costo = new Costo(id_p, id_t, p);
        return Mensaje.gestor_mensajes( costo.save(),Costo.class.getSimpleName(),"Registar");
    }
    
    public  Mensaje addMuestra(String id_tela, String id_color, String imagen ){
        int id_c = Integer.parseInt(id_color);
        int id_t = Integer.parseInt(id_tela);
        muestra = new Muestra(imagen, id_t, id_c);
        return Mensaje.gestor_mensajes( muestra.save(),Muestra.class.getSimpleName(),"Registar");
    }
         
    public  Mensaje eliminarCosto( String id){
        int cod = Integer.parseInt(id);
        costo = Costo.find(cod, ()->new Costo());
       return Mensaje.gestor_mensajes( costo.delete(),Costo.class.getSimpleName(),"Eliminar");
    }  
        
    public  Mensaje eliminarMuestra( String id){
        int cod = Integer.parseInt(id);
        muestra = Muestra.find(cod, ()->new Muestra());
       return Mensaje.gestor_mensajes( muestra.delete(),Muestra.class.getSimpleName(),"Eliminar");
    } 
    
    public  List<Costo> listarCosto(String id_tela){
        List<Costo> listarCostos = new LinkedList<>();
        int id = Integer.parseInt(id_tela);
        listarCostos = Costo.all(() -> new Costo(),id);
    return listarCostos;
    } 
    
        
    public  List<Muestra> listarMuestra(String id_tela){
        
        List<Muestra> listarMuestras = new LinkedList<>();
        int id = Integer.parseInt(id_tela);
        listarMuestras = Muestra.all(() -> new Muestra(),id);
    return listarMuestras;
    } 
       
}
