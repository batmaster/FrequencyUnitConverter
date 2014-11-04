
package net.webservicex;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "FrequencyUnit", targetNamespace = "http://www.webserviceX.NET/", wsdlLocation = "http://www.webservicex.net/convertFrequency.asmx?WSDL")
public class FrequencyUnit
    extends Service
{

    private final static URL FREQUENCYUNIT_WSDL_LOCATION;
    private final static WebServiceException FREQUENCYUNIT_EXCEPTION;
    private final static QName FREQUENCYUNIT_QNAME = new QName("http://www.webserviceX.NET/", "FrequencyUnit");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.webservicex.net/convertFrequency.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        FREQUENCYUNIT_WSDL_LOCATION = url;
        FREQUENCYUNIT_EXCEPTION = e;
    }

    public FrequencyUnit() {
        super(__getWsdlLocation(), FREQUENCYUNIT_QNAME);
    }

    public FrequencyUnit(WebServiceFeature... features) {
        super(__getWsdlLocation(), FREQUENCYUNIT_QNAME, features);
    }

    public FrequencyUnit(URL wsdlLocation) {
        super(wsdlLocation, FREQUENCYUNIT_QNAME);
    }

    public FrequencyUnit(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, FREQUENCYUNIT_QNAME, features);
    }

    public FrequencyUnit(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FrequencyUnit(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns FrequencyUnitSoap
     */
    @WebEndpoint(name = "FrequencyUnitSoap")
    public FrequencyUnitSoap getFrequencyUnitSoap() {
        return super.getPort(new QName("http://www.webserviceX.NET/", "FrequencyUnitSoap"), FrequencyUnitSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FrequencyUnitSoap
     */
    @WebEndpoint(name = "FrequencyUnitSoap")
    public FrequencyUnitSoap getFrequencyUnitSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webserviceX.NET/", "FrequencyUnitSoap"), FrequencyUnitSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (FREQUENCYUNIT_EXCEPTION!= null) {
            throw FREQUENCYUNIT_EXCEPTION;
        }
        return FREQUENCYUNIT_WSDL_LOCATION;
    }

}