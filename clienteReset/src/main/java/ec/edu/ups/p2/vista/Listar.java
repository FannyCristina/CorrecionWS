package ec.edu.ups.p2.vista;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Listar extends JInternalFrame {
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Listar frame = new Listar();
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
	public Listar() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(80, 92, 4, 4);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setBounds(0, 0, 1, 1);
		getContentPane().add(table);
		
		table.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null }, },
				new String[] { "Codigo", "Producto", "Stock", "precio" }));
		scrollPane.setViewportView(table);

	}

}
