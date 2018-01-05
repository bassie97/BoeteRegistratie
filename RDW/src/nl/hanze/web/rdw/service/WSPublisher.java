package nl.hanze.web.rdw.service;


import javax.xml.ws.Endpoint;

public class WSPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8888/RDW", new RDWgegevens());
    }
}
