package model.dao;

import config.PersistenciaJPA;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Animal;
import model.EspecieAnimal;

public class AnimalDAO extends PersistenciaJPA {

    public List<Animal> listaAnimais() {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Animal> query
                    = em.createQuery("SELECT v FROM Animal v", Animal.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
    
    public List<Animal> buscarAnimaisDisponiveisPorEspecie(EspecieAnimal especie) {
    EntityManager em = getEntityManager();
    try {
        String jpql = "SELECT a FROM Animal a WHERE a.especie = :especie AND a.disponivel = true";
        
        TypedQuery<Animal> query = em.createQuery(jpql, Animal.class);
        query.setParameter("especie", especie);
        
        return query.getResultList();
    } catch (Exception e) {
        e.printStackTrace();
        return new ArrayList<>(); 
    }
}
}
