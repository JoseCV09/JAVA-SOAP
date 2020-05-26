
package uasi.ws_gestdocente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wsfechaexamenesplanResult" type="{http://UASI/WS_GESTDOCENTE.wsdl}ArrayOfClaseFechaExamenesPlan" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "wsfechaexamenesplanResult"
})
@XmlRootElement(name = "wsfechaexamenesplanResponse")
public class WsfechaexamenesplanResponse {

    protected ArrayOfClaseFechaExamenesPlan wsfechaexamenesplanResult;

    /**
     * Obtiene el valor de la propiedad wsfechaexamenesplanResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClaseFechaExamenesPlan }
     *     
     */
    public ArrayOfClaseFechaExamenesPlan getWsfechaexamenesplanResult() {
        return wsfechaexamenesplanResult;
    }

    /**
     * Define el valor de la propiedad wsfechaexamenesplanResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClaseFechaExamenesPlan }
     *     
     */
    public void setWsfechaexamenesplanResult(ArrayOfClaseFechaExamenesPlan value) {
        this.wsfechaexamenesplanResult = value;
    }

}
