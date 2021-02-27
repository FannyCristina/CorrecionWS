
package ec.edu.ups.p2.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.edu.ups.p2.services package. 
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

    private final static QName _GuardarCarrito_QNAME = new QName("http://services.p2.ups.edu.ec/", "guardarCarrito");
    private final static QName _Exception_QNAME = new QName("http://services.p2.ups.edu.ec/", "Exception");
    private final static QName _GetProductos_QNAME = new QName("http://services.p2.ups.edu.ec/", "getProductos");
    private final static QName _GuardarProductos_QNAME = new QName("http://services.p2.ups.edu.ec/", "guardarProductos");
    private final static QName _GuardarProductosResponse_QNAME = new QName("http://services.p2.ups.edu.ec/", "guardarProductosResponse");
    private final static QName _GuardarCarritoResponse_QNAME = new QName("http://services.p2.ups.edu.ec/", "guardarCarritoResponse");
    private final static QName _GetProductosResponse_QNAME = new QName("http://services.p2.ups.edu.ec/", "getProductosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.edu.ups.p2.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GuardarProductosResponse }
     * 
     */
    public GuardarProductosResponse createGuardarProductosResponse() {
        return new GuardarProductosResponse();
    }

    /**
     * Create an instance of {@link GuardarCarritoResponse }
     * 
     */
    public GuardarCarritoResponse createGuardarCarritoResponse() {
        return new GuardarCarritoResponse();
    }

    /**
     * Create an instance of {@link GetProductosResponse }
     * 
     */
    public GetProductosResponse createGetProductosResponse() {
        return new GetProductosResponse();
    }

    /**
     * Create an instance of {@link GetProductos }
     * 
     */
    public GetProductos createGetProductos() {
        return new GetProductos();
    }

    /**
     * Create an instance of {@link GuardarProductos }
     * 
     */
    public GuardarProductos createGuardarProductos() {
        return new GuardarProductos();
    }

    /**
     * Create an instance of {@link GuardarCarrito }
     * 
     */
    public GuardarCarrito createGuardarCarrito() {
        return new GuardarCarrito();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuardarCarrito }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.p2.ups.edu.ec/", name = "guardarCarrito")
    public JAXBElement<GuardarCarrito> createGuardarCarrito(GuardarCarrito value) {
        return new JAXBElement<GuardarCarrito>(_GuardarCarrito_QNAME, GuardarCarrito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.p2.ups.edu.ec/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.p2.ups.edu.ec/", name = "getProductos")
    public JAXBElement<GetProductos> createGetProductos(GetProductos value) {
        return new JAXBElement<GetProductos>(_GetProductos_QNAME, GetProductos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuardarProductos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.p2.ups.edu.ec/", name = "guardarProductos")
    public JAXBElement<GuardarProductos> createGuardarProductos(GuardarProductos value) {
        return new JAXBElement<GuardarProductos>(_GuardarProductos_QNAME, GuardarProductos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuardarProductosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.p2.ups.edu.ec/", name = "guardarProductosResponse")
    public JAXBElement<GuardarProductosResponse> createGuardarProductosResponse(GuardarProductosResponse value) {
        return new JAXBElement<GuardarProductosResponse>(_GuardarProductosResponse_QNAME, GuardarProductosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuardarCarritoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.p2.ups.edu.ec/", name = "guardarCarritoResponse")
    public JAXBElement<GuardarCarritoResponse> createGuardarCarritoResponse(GuardarCarritoResponse value) {
        return new JAXBElement<GuardarCarritoResponse>(_GuardarCarritoResponse_QNAME, GuardarCarritoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.p2.ups.edu.ec/", name = "getProductosResponse")
    public JAXBElement<GetProductosResponse> createGetProductosResponse(GetProductosResponse value) {
        return new JAXBElement<GetProductosResponse>(_GetProductosResponse_QNAME, GetProductosResponse.class, null, value);
    }

}
