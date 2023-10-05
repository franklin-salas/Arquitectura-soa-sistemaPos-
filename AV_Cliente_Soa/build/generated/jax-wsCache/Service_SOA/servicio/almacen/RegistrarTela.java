
package servicio.almacen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para registrarTela complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="registrarTela">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="altura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="precioDeVenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoTela" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_diseno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registrarTela", propOrder = {
    "codigo",
    "marca",
    "altura",
    "precioDeVenta",
    "tipoTela",
    "idDiseno"
})
public class RegistrarTela {

    protected String codigo;
    protected String marca;
    protected String altura;
    protected String precioDeVenta;
    protected String tipoTela;
    @XmlElement(name = "id_diseno")
    protected String idDiseno;

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad marca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Define el valor de la propiedad marca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarca(String value) {
        this.marca = value;
    }

    /**
     * Obtiene el valor de la propiedad altura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltura() {
        return altura;
    }

    /**
     * Define el valor de la propiedad altura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltura(String value) {
        this.altura = value;
    }

    /**
     * Obtiene el valor de la propiedad precioDeVenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecioDeVenta() {
        return precioDeVenta;
    }

    /**
     * Define el valor de la propiedad precioDeVenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecioDeVenta(String value) {
        this.precioDeVenta = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoTela.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoTela() {
        return tipoTela;
    }

    /**
     * Define el valor de la propiedad tipoTela.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoTela(String value) {
        this.tipoTela = value;
    }

    /**
     * Obtiene el valor de la propiedad idDiseno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDiseno() {
        return idDiseno;
    }

    /**
     * Define el valor de la propiedad idDiseno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDiseno(String value) {
        this.idDiseno = value;
    }

}
