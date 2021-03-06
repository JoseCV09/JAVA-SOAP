
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
 *         &lt;element name="wsareasdptoResult" type="{http://UASI/WS_GESTDOCENTE.wsdl}ArrayOfClaseAreasDpto" minOccurs="0"/&gt;
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
    "wsareasdptoResult"
})
@XmlRootElement(name = "wsareasdptoResponse")
public class WsareasdptoResponse {

    protected ArrayOfClaseAreasDpto wsareasdptoResult;

    /**
     * Obtiene el valor de la propiedad wsareasdptoResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClaseAreasDpto }
     *     
     */
    public ArrayOfClaseAreasDpto getWsareasdptoResult() {
        return wsareasdptoResult;
    }

    /**
     * Define el valor de la propiedad wsareasdptoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClaseAreasDpto }
     *     
     */
    public void setWsareasdptoResult(ArrayOfClaseAreasDpto value) {
        this.wsareasdptoResult = value;
    }

}
