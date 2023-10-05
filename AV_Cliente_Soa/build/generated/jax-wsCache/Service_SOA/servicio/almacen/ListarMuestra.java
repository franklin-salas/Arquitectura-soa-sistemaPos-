
package servicio.almacen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para listarMuestra complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="listarMuestra">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "listarMuestra", propOrder = {
    "idTela"
})
public class ListarMuestra {

    @XmlElement(name = "id_tela")
    protected String idTela;

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
