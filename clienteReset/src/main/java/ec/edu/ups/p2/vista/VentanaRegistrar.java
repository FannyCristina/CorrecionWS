package ec.edu.ups.p2.vista;


import ec.edu.ups.p2.services.Exception_Exception;
import ec.edu.ups.p2.services.Ingresar;
import ec.edu.ups.p2.services.Producto;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;

import java.awt.Font;
import java.security.Principal;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class VentanaRegistrar extends JInternalFrame {

	private Principal principal;
	public JScrollPane scrollPane;
	public JTable table;

	DefaultTableModel modelo;

	private static Ingresar port;

//	public void guardar() {
//		try {
//
//			List<Libros> lstLibros=new ArrayList<Libros>();
//			
//				for (int i = 0; i < table.getRowCount(); i++) {
//					
//					Libros l = new Libros();
//					l.setTitulo((String) table.getValueAt(i, 0));
//					l.setNombreAutor((String) table.getValueAt(i, 1));
//					l.setApellidoAutor((String) table.getValueAt(i, 2));
//					l.setCategoria((String) table.getValueAt(i, 3));
//					l.setPrecio((Double)table.getValueAt(i, 4));
//					l.setOrdenes(o);
//					lstLibros.add(l);
//					
//				}
//				m.gestionOrdenesRemote.guardarClientes(c);
//			m.gestionOrdenesRemote.guardarOrdenes(o);
//		} catch (Exception ex) {
//			Logger.getLogger(VentanaRegistrar.class.getName()).log(Level.SEVERE, null, ex);
//		}
//
//	}

	public void cargarDatos() {
		{
			System.out.println("Invoking getProductos...");
			try {
				java.util.List<ec.edu.ups.p2.services.Producto> _getProductos__return = port
						.getProductos();

				Object[] columnas = { "Codigo", "Nombre", "Stock" };
				Object[][] datos = new Object[_getProductos__return.size()][3];

				table.setModel(modelo);
				int cont = 0;

				for (Producto p : _getProductos__return) {
					datos[cont][0] = p.getCodigo();
					datos[cont][1] = p.getNombreProducto();
					datos[cont][2] = p.getPrecio();
					datos[cont][3] = p.getStock();
					cont++;
				}

				modelo = new DefaultTableModel(datos, columnas);
				table.setModel(modelo);

				System.out.println("getProductos.result=" + _getProductos__return);

			} catch (Exception_Exception e) {
				System.out.println("Expected exception: Exception has occurred.");
				System.out.println(e.toString());
			}
		}
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRegistrar frame = new VentanaRegistrar(port);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaRegistrar(Ingresar port) {
		this.port = port;

		setTitle("Comprar");
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(50, 50, 664, 509);

		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		
		btnListar.setFont(new Font("Avenir", Font.PLAIN, 12));
		getContentPane().add(btnListar);

		scrollPane = new JScrollPane();
		getContentPane().add(scrollPane);

		table = new JTable();
		table.setFont(new Font("Avenir", Font.PLAIN, 12));

		table.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null }, },
				new String[] { "Codigo", "Producto", "Stock", "precio" }));
		scrollPane.setViewportView(table);

	}
}
