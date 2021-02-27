package ec.edu.ups.p2.vista;


import ec.edu.ups.p2.services.Ingresar;
import ec.edu.ups.p2.services.IngresarService;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.namespace.QName;



import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

    private JPanel contentPane;
    private static final QName SERVICE_NAME = new QName("http://services.p2.ups.edu.ec/", "IngresarService");
	private IngresarService ss;
    private Ingresar port;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		URL wsdlURL = IngresarService.WSDL_LOCATION;
		ss = new IngresarService(wsdlURL, SERVICE_NAME);
		port = ss.getIngresarPort();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 951, 576);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Productos");
		menuBar.add(mnNewMenu);
		
		
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Agregar Productos");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VentanaIngresarProductos vd = new VentanaIngresarProductos(port);
				getContentPane().add(vd);
				vd.show();
				
				
			}
		});
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Listar Producto");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VentanaRegistrar vr = new VentanaRegistrar(port);
				getContentPane().add(vr);
				vr.show();
				
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Compras");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VentanaComprasProductos vr=new VentanaComprasProductos(port);
				getContentPane().add(vr);
				vr.show();
			}
		});
		menuBar.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}


}
