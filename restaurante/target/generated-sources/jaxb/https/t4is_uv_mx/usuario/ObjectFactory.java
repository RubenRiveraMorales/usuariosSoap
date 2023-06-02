//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.06.01 a las 07:04:11 PM CDT 
//


package https.t4is_uv_mx.usuario;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.t4is_uv_mx.usuario package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BuscarIdRequest_QNAME = new QName("https://t4is.uv.mx/usuario", "BuscarIdRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.t4is_uv_mx.usuario
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarIdResponse }
     * 
     */
    public BuscarIdResponse createBuscarIdResponse() {
        return new BuscarIdResponse();
    }

    /**
     * Create an instance of {@link UsuarioRequest }
     * 
     */
    public UsuarioRequest createUsuarioRequest() {
        return new UsuarioRequest();
    }

    /**
     * Create an instance of {@link UsuarioResponse }
     * 
     */
    public UsuarioResponse createUsuarioResponse() {
        return new UsuarioResponse();
    }

    /**
     * Create an instance of {@link BuscarIdResponse.Usuarios }
     * 
     */
    public BuscarIdResponse.Usuarios createBuscarIdResponseUsuarios() {
        return new BuscarIdResponse.Usuarios();
    }

    /**
     * Create an instance of {@link ModificarUsuarioRequest }
     * 
     */
    public ModificarUsuarioRequest createModificarUsuarioRequest() {
        return new ModificarUsuarioRequest();
    }

    /**
     * Create an instance of {@link ModificarUsuarioResponse }
     * 
     */
    public ModificarUsuarioResponse createModificarUsuarioResponse() {
        return new ModificarUsuarioResponse();
    }

    /**
     * Create an instance of {@link EliminarUsuarioRequest }
     * 
     */
    public EliminarUsuarioRequest createEliminarUsuarioRequest() {
        return new EliminarUsuarioRequest();
    }

    /**
     * Create an instance of {@link EliminarUsuarioResponse }
     * 
     */
    public EliminarUsuarioResponse createEliminarUsuarioResponse() {
        return new EliminarUsuarioResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "https://t4is.uv.mx/usuario", name = "BuscarIdRequest")
    public JAXBElement<Object> createBuscarIdRequest(Object value) {
        return new JAXBElement<Object>(_BuscarIdRequest_QNAME, Object.class, null, value);
    }

}
