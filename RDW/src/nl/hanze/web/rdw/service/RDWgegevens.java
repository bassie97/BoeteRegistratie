package nl.hanze.web.rdw.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class RDWgegevens {
    @WebMethod
    public String getGegevens(String kenteken) {
        return "Hallo " +kenteken;
    }
}