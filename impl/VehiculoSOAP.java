
package soapws.impl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "VehiculoSOAP", targetNamespace = "http://impl.soapws/", wsdlLocation = "http://localhost:8080/SOAP_war_exploded/vehiculo?wsdl")
public class VehiculoSOAP
    extends Service
{

    private final static URL VEHICULOSOAP_WSDL_LOCATION;
    private final static WebServiceException VEHICULOSOAP_EXCEPTION;
    private final static QName VEHICULOSOAP_QNAME = new QName("http://impl.soapws/", "VehiculoSOAP");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/SOAP_war_exploded/vehiculo?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VEHICULOSOAP_WSDL_LOCATION = url;
        VEHICULOSOAP_EXCEPTION = e;
    }

    public VehiculoSOAP() {
        super(__getWsdlLocation(), VEHICULOSOAP_QNAME);
    }

    public VehiculoSOAP(WebServiceFeature... features) {
        super(__getWsdlLocation(), VEHICULOSOAP_QNAME, features);
    }

    public VehiculoSOAP(URL wsdlLocation) {
        super(wsdlLocation, VEHICULOSOAP_QNAME);
    }

    public VehiculoSOAP(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, VEHICULOSOAP_QNAME, features);
    }

    public VehiculoSOAP(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VehiculoSOAP(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns VehiculoPORT
     */
    @WebEndpoint(name = "VehiculoSOAPImplPort")
    public VehiculoPORT getVehiculoSOAPImplPort() {
        return super.getPort(new QName("http://impl.soapws/", "VehiculoSOAPImplPort"), VehiculoPORT.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VehiculoPORT
     */
    @WebEndpoint(name = "VehiculoSOAPImplPort")
    public VehiculoPORT getVehiculoSOAPImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://impl.soapws/", "VehiculoSOAPImplPort"), VehiculoPORT.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VEHICULOSOAP_EXCEPTION!= null) {
            throw VEHICULOSOAP_EXCEPTION;
        }
        return VEHICULOSOAP_WSDL_LOCATION;
    }

}
