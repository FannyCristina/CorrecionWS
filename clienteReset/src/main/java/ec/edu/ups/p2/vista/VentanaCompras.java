package ec.edu.ups.p2.vista;


import ec.edu.ups.p2.services.Ingresar;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.sound.midi.Soundbank;
import javax.swing.JButton;
import javax.swing.JTextField;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class VentanaCompras extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static Ingresar port;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCompras frame = new VentanaCompras(port);
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public VentanaCompras(Ingresar port) {

		this.port = port;

		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(45, 45, 563, 353);
		getContentPane().setLayout(null);

	}
}
