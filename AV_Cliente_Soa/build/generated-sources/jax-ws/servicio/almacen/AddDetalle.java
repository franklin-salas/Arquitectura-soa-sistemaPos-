
package servicio.almacen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para addDetalle complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="addDetalle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="metraje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_rollo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addDetalle", propOrder = {
    "metraje",
    "precio",
    "descripcion",
    "idRollo"
})
public class AddDetalle {

    protected String metraje;
    protected String precio;
    protected String descripcion;
    @XmlElement(name = "id_rollo")
    protected String idRollo;

    /**
     * Obtiene el valor de la propiedad metraje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetraje() {
        return metraje;
    }

    /**
     * Define el valor de la propiedad metraje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetraje(String value) {
        this.metraje = value;
    }

    /**
     * Obtiene el valor de la propiedad precio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecio(String value) {
        this.precio = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad idRollo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdRollo() {
        return idRollo;
    }

    /**
     * Define el valor de la propiedad idRollo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdRollo(String value) {
        this.idRollo = value;
    }

}
