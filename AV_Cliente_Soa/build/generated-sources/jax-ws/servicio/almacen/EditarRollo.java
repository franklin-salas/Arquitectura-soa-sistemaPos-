
package servicio.almacen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para editarRollo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="editarRollo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metraje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_almacen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_tela" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editarRollo", propOrder = {
    "id",
    "codigo",
    "metraje",
    "estado",
    "idAlmacen",
    "idColor",
    "idTela"
})
public class EditarRollo {

    protected String id;
    protected String codigo;
    protected String metraje;
    protected String estado;
    @XmlElement(name = "id_almacen")
    protected String idAlmacen;
    @XmlElement(name = "id_color")
    protected String idColor;
    @XmlElement(name = "id_tela")
    protected String idTela;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

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
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad idAlmacen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAlmacen() {
        return idAlmacen;
    }

    /**
     * Define el valor de la propiedad idAlmacen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAlmacen(String value) {
        this.idAlmacen = value;
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

}
