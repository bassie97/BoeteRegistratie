package nl.hanze.web.rdw.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.*;
import java.util.List;

@WebService
public class RDWgegevens {

    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
            .createEntityManagerFactory("JavaHelps");

    private static EntityManager manager;


    public RDWgegevens(){
        manager = ENTITY_MANAGER_FACTORY.createEntityManager();
    }

    @WebMethod
    public Info getGegevens(String kenteken) {
        List<Voertuig> results = manager.createNamedQuery("Voertuig.findByKenteken", Voertuig.class)
                .setParameter("kenteken", kenteken).getResultList();

        Info i = new Info();

        if(results.size() > 0){
            i.setVoertuig(results.get(0));
            i.setStatusInfoAanvraag("OK");
            return i;
        } else {
            Voertuig v = new Voertuig();
            v.setKenteken(kenteken);
            i.setVoertuig(v);
            i.setStatusInfoAanvraag("NOT FOUND!");
            return i;
        }

    }
}