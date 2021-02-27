
package ec.edu.ups.p2.services;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2021-02-27T00:59:21.096-05:00
 * Generated source version: 2.7.11
 * 
 */
public final class Ingresar_IngresarPort_Client {

    private static final QName SERVICE_NAME = new QName("http://services.p2.ups.edu.ec/", "IngresarService");

    private Ingresar_IngresarPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = IngresarService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        IngresarService ss = new IngresarService(wsdlURL, SERVICE_NAME);
        Ingresar port = ss.getIngresarPort();  
        
        {
        System.out.println("Invoking guardarCarrito...");
        int _guardarCarrito_arg0 = 0;
        java.lang.String _guardarCarrito_arg1 = "";
        int _guardarCarrito_arg2 = 0;
        try {
            port.guardarCarrito(_guardarCarrito_arg0, _guardarCarrito_arg1, _guardarCarrito_arg2);

        } catch (Exception_Exception e) { 
            System.out.println("Expected exception: Exception has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getProductos...");
        try {
            java.util.List<ec.edu.ups.p2.services.Producto> _getProductos__return = port.getProductos();
            System.out.println("getProductos.result=" + _getProductos__return);

        } catch (Exception_Exception e) { 
            System.out.println("Expected exception: Exception has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking guardarProductos...");
        java.lang.String _guardarProductos_arg0 = "";
        double _guardarProductos_arg1 = 0.0;
        int _guardarProductos_arg2 = 0;
        port.guardarProductos(_guardarProductos_arg0, _guardarProductos_arg1, _guardarProductos_arg2);


        }

        System.exit(0);
    }

}