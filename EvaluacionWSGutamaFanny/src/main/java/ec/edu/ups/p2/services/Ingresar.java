package ec.edu.ups.p2.services;

import ec.edu.ups.p2.modelo.Carro;
import ec.edu.ups.p2.modelo.Producto;
import ec.edu.ups.p2.on.CarroOnRemoto;
import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;



@WebService
public class Ingresar {

	@Inject
        CarroOnRemoto ejb;	

	@WebMethod
	public List<Producto> getProductos() throws Exception {
		return ejb.getProductos();
	}

	@WebMethod
	public void guardarProductos(String nombreProducto, double precio, int stock) {
		Producto p = new Producto();

		p.setNombreProducto(nombreProducto);
		p.setPrecio(precio);
		p.setStock(stock);

		try {
			ejb.guardarProducto(p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@WebMethod
	public void guardarCarrito(int cantidad, String usuario, int codigoProducto) throws Exception {
		          Carro c = new Carro();
		Producto p = ejb.getProducto(codigoProducto);
		int stock = p.getStock();

		if (cantidad <= stock) {
			int newStock = stock - cantidad;
			c.setCantidad(cantidad);
			c.setUsuario(usuario);
			c.setProductos(p);

			p.setStock(newStock);

			ejb.guardarCarrito(c);
			ejb.actualizarProducto(p);
		} else {
			System.out.println("Error no existe Stock");
		}
	}

}
