/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.p2.dao;

import ec.edu.ups.p2.modelo.Producto;
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
public class ProductoDAO {

    @PersistenceContext(name = "EvaluacionWSGutamaFannyPersistenceUnit")
    private EntityManager em;

    public void insert(Producto pro) {
        em.persist(pro);
    }

    public void update(Producto pro) {
        em.merge(pro);
    }

    public Producto read(int codigo) {
        return em.find(Producto.class, codigo);
    }

    public Producto getProducto(int codigo) {
        String jpql = "SELECT pro FROM Producto pro WHERE codigo = :codigo";
        Query q = em.createQuery(jpql, Producto.class);
        q.setParameter("codigo", codigo);
        return (Producto) q.getSingleResult();
    }

    public List<Producto> getProductos() {
        String jpql = "SELECT pro FROM Producto pro";
        Query q = em.createQuery(jpql, Producto.class);
        return q.getResultList();
    }

}
