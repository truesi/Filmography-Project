
package com;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.1
 * 2015-12-07T16:03:41.592+02:00
 * Generated source version: 3.1.1
 */

@WebFault(name = "CbossException", targetNamespace = "http://kz.kcell.apps.pentagon.coda.ws")
public class CbossException_Exception extends Exception {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -5425488231369953551L;
	private CbossException cbossException;

    public CbossException_Exception() {
        super();
    }
    
    public CbossException_Exception(String message) {
        super(message);
    }
    
    public CbossException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public CbossException_Exception(String message, CbossException cbossException) {
        super(message);
        this.cbossException = cbossException;
    }

    public CbossException_Exception(String message, CbossException cbossException, Throwable cause) {
        super(message, cause);
        this.cbossException = cbossException;
    }

    public CbossException getFaultInfo() {
        return this.cbossException;
    }
}
