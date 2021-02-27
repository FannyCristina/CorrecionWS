/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.p2.on;

import ec.edu.ups.p2.modelo.Carro;
import ec.edu.ups.p2.modelo.Persona;
import ec.edu.ups.p2.modelo.Producto;
import java.util.List;

/**
 *
 * @author Fanny
 */
public interface CarroOnRemoto {

    public void guardarCarrito(Carro carro) throws Exception;

    public void guardarVentas(Persona ven) throws Exception;

    public void guardarProducto(Producto pro) throws Exception;

    public void actualizarProducto(Producto pro) throws Exception;

    public Producto getProducto(int codigo) throws Exception;

    public List<Producto> getProductos() throws Exception;
}
