
package servicio.almacen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para addMuestra complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="addMuestra">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_tela" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imagen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addMuestra", propOrder = {
    "idTela",
    "idColor",
    "imagen"
})
public class AddMuestra {

    @XmlElement(name = "id_tela")
    protected String idTela;
    @XmlElement(name = "id_color")
    protected String idColor;
    protected String imagen;

    /**
     * Obtiene el valor de la propiedad idTela.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTela() {
        return idTela;
    }

    /**
     * Define el valor de la propiedad idTela.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTela(String value) {
        this.idTela = value;
    }

    /**
     * Obtiene el valor de la propiedad idColor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdColor() {
        return idColor;
    }

    /**
     * Define el valor de la propiedad idColor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdColor(String value) {
        this.idColor = value;
    }

    /**
     * Obtiene el valor de la propiedad imagen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * Define el valor de la propiedad imagen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagen(String value) {
        this.imagen = value;
    }

}
