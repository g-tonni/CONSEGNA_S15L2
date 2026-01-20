package giada_tonni;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("consegnas15l2pu");

    public static void main(String[] args) {
        System.out.println("CIAO");
    }
}
