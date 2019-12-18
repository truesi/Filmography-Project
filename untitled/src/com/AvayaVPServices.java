package com;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.1
 * 2015-12-07T16:03:41.655+02:00
 * Generated source version: 3.1.1
 * 
 */
@WebServiceClient(name = "avayaVPServices", 
                  wsdlLocation = "http://ldb-kms.kcell.kz/coda/avaya_vp?wsdl",
                  targetNamespace = "http://kz.kcell.apps.pentagon.coda.ws") 
public class AvayaVPServices extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://kz.kcell.apps.pentagon.coda.ws", "avayaVPServices");
    public final static QName AvayaVoicePortalServicesWSPort = new QName("http://kz.kcell.apps.pentagon.coda.ws", "AvayaVoicePortalServicesWSPort");
    static {
        URL url = null;
        try {
            url = new URL("http://ldb-kms.kcell.kz/coda/avaya_vp?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AvayaVPServices.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://ldb-kms.kcell.kz/coda/avaya_vp?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public AvayaVPServices(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AvayaVPServices(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AvayaVPServices() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     *
     * @return
     *     returns AvayaVoicePortalServicesWS
     */
    @WebEndpoint(name = "AvayaVoicePortalServicesWSPort")
    public AvayaVoicePortalServicesWS getAvayaVoicePortalServicesWSPort() {
        return super.getPort(AvayaVoicePortalServicesWSPort, AvayaVoicePortalServicesWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AvayaVoicePortalServicesWS
     */
    @WebEndpoint(name = "AvayaVoicePortalServicesWSPort")
    public AvayaVoicePortalServicesWS getAvayaVoicePortalServicesWSPort(WebServiceFeature... features) {
        return super.getPort(AvayaVoicePortalServicesWSPort, AvayaVoicePortalServicesWS.class, features);
    }

}