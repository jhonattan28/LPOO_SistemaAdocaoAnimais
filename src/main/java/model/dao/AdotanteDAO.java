package model.dao;

import config.PersistenciaJPA;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Adotante;

public class AdotanteDAO extends PersistenciaJPA {

    public List<Adotante> listaAdotantes() {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Adotante> query
                    = em.createQuery("SELECT v FROM Adotante v", Adotante.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
