package edu.upc.dsa.View;

import com.sun.net.httpserver.HttpServer;

import java.net.URI;

/**
 * Hello world!
 *
 */
public class App 
{

    public static final String BASE_URI = "http://localhost:8080/minim2_josean_api/";

    /**
     * Starts Grizzly HTTP server exposing JAX-RS resources defined in this application.
     * @return Grizzly HTTP server.
     */
    public static HttpServer startServer() {
        // set a resource config that scans for JAX-RS resources and providers
        // in edu.upc.dsa package
        final ResourceConfig rc = new ResourceConfig().packages("edu.upc.dsa.View","edu.upc.dsa.Controller","edu.upc.dsa");
        //rc.register(MultiPartFeature.class);
        // set and start a new instance of grizzly http server
        // exposing the Jersey application at BASE_URI
        return GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), rc);
    }


}
