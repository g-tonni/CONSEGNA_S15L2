package giada_tonni.DAO;

import giada_tonni.entities.Evento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class EventiDAO {

     private final EntityManager entityManager;

     public EventiDAO(EntityManager entityManager){
         this.entityManager = entityManager;
     }

     public void save(Evento evento){
         // 1. Creare la transazione
         EntityTransaction transaction = entityManager.getTransaction();

         // 2. Aprire la transazione
         transaction.begin();

         // 3. Fare il persist
         entityManager.persist(evento);

         // 4. Fare il commit
         transaction.commit();

         // 5. Log di controllo
         System.out.println("Evento salvato");
     }
}
