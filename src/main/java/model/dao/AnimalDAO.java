package model.dao;

import config.PersistenciaJPA;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Animal;

public class AnimalDAO extends PersistenciaJPA {

    public List<Animal> listaAnimais() {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Animal> query
                    = em.createQuery("SELECT v FROM Animal v", Animal.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
