/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.p2.on;

import ec.edu.ups.p2.dao.CarroDAO;
import ec.edu.ups.p2.dao.PersonaDAO;
import ec.edu.ups.p2.dao.ProductoDAO;
import ec.edu.ups.p2.modelo.Carro;
import ec.edu.ups.p2.modelo.Persona;
import ec.edu.ups.p2.modelo.Producto;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Fanny
 */
@Stateless
public class CarroON implements CarroOnRemoto {

    @Inject
	PersonaDAO daoVentas;

	@Inject
	CarroDAO daoCarroCompra;

	@Inject
	ProductoDAO daoProductos;

	public void guardarCarrito(Carro carro) throws Exception {

		Carro aux = daoCarroCompra.read(carro.getCodigoCarro());

		if (aux != null) {
			daoCarroCompra.update(carro);
		} else {
			daoCarroCompra.insert(carro);
		}

	}


	public void guardarVentas(Persona per) throws Exception {

		Persona aux = daoVentas.read(per.getCodigo());

		if (aux != null) {
			daoVentas.update(per);
		} else {
			daoVentas.insert(per);
		}

	}

	
	public void guardarProducto(Producto pro) throws Exception {

		Producto aux = daoProductos.read(pro.getCodigo());

		if (aux != null) {
			daoProductos.update(pro);
		} else {
			daoProductos.insert(pro);
		}
	}

	
	public void actualizarProducto(Producto pro) throws Exception {

		Producto aux = daoProductos.read(pro.getCodigo());

		if (aux != null) {
			daoProductos.update(pro);
		} else {
			daoProductos.insert(pro);
		}
	}

	
	public Producto getProducto(int codigo) throws Exception {
		Producto p=daoProductos.getProducto(codigo);
		return p;
	}


	public List<Producto> getProductos() throws Exception {
		return daoProductos.getProductos();
	}
}
