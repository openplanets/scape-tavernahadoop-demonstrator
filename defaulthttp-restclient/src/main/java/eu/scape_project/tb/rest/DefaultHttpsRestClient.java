/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package eu.scape_project.tb.rest;

import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.BasicClientConnectionManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Sven Schlarb https://github.com/shsdev
 * @version 0.1
 */
public class DefaultHttpsRestClient extends DefaultHttpRestClient {

    private static Logger logger = LoggerFactory.getLogger(DefaultHttpsRestClient.class.getName());
    
    public DefaultHttpsRestClient(BasicClientConnectionManager bccm, String scheme, String host, int port, String basePath) {
        super(bccm);
        init(scheme, host, port, basePath);
    }

}
