/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.p2.dao;

import ec.edu.ups.p2.modelo.Carro;
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
public class CarroDAO {

    @PersistenceContext(name = "EvaluacionWSGutamaFannyPersistenceUnit")

    private EntityManager em;

    public void insert(Carro carrito) {
        if (read(carrito.getCodigoCarro()) != null) {
            em.persist(carrito);
        } else {
            update(carrito);
        }
    }

    public Carro read(int codigoCarrito) {
        return em.find(Carro.class, codigoCarrito);
    }

    public void update(Carro carrito) {
        em.merge(carrito);
    }
}
