package ec.edu.ups.p2.services;

import ec.edu.ups.p2.modelo.Carro;
import ec.edu.ups.p2.modelo.Producto;
import ec.edu.ups.p2.on.CarroOnRemoto;
import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/comprar")
public class Ingresarrest {

    @Inject
    CarroOnRemoto ejb;

    @GET
    @Consumes("application/json")
    @Path("/listProducto")
    public List<Producto> getProductos() throws Exception {

        System.out.println("" + ejb.getProductos());
        return null;
    }

    @PUT
    @Consumes("application/json")
    @Path("guardarproducto/{descripcion}/{precio}/{stock}")
    public void guardarProducto(@PathParam("descripcion") String descripcion, @PathParam("precio") double precio, @PathParam("stock") int stock) throws Exception {
        Producto producto = new Producto();
        producto.setNombreProducto(descripcion);
        producto.setPrecio(precio);
        producto.setStock(stock);
        ejb.guardarProducto(producto);

    }

    @PUT
    @Consumes("application/json")
    @Path("guardarcarrito/{cantidad}/{usuario}/{codigoProducto}")
    public void guardarCarrito(@PathParam("cantidad") int cantidad, @PathParam("usuario") String usuario, @PathParam("codigoProducto") int codigoProducto) {
        Carro c = new Carro();
        Producto p;
        try {
            p = ejb.getProducto(codigoProducto);
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
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
