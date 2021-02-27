/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.p2.dao;

import ec.edu.ups.p2.modelo.Persona;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Fanny
 */
@Stateless
public class PersonaDAO {

    @PersistenceContext(name = "EvaluacionWSGutamaFannyPersistenceUnit")
    private EntityManager em;

    public void insert(Persona ven) {
        if (read(ven.getCodigo()) != null) {
            em.persist(ven);
        } else {
            update(ven);
        }
    }

    public Persona read(int codigo) {
        return em.find(Persona.class, codigo);
    }

    public void update(Persona ven) {
        em.merge(ven);
    }

    public List<Persona> getVentas() {
        String jpql = "SELECT per FROM persona per";
        Query q = em.createQuery(jpql, Persona.class);
        return q.getResultList();
    }
}
