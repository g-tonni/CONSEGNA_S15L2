package giada_tonni.DAO;

import jakarta.persistence.EntityManager;

public class EventiDAO {

     private final EntityManager entityManager;

     public EventiDAO(EntityManager entityManager){
         this.entityManager = entityManager;
     }
}
