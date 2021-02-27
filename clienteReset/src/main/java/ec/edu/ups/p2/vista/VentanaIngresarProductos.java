package ec.edu.ups.p2.vista;

import ec.edu.ups.p2.services.Exception_Exception;
import ec.edu.ups.p2.services.Ingresar;
import ec.edu.ups.p2.services.Producto;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.security.Principal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VentanaIngresarProductos extends JInternalFrame {

    private Principal principal;
    public JScrollPane scrollPane;
    public JTable table;

    DefaultTableModel modelo = new DefaultTableModel();
    private JScrollPane scrollPane_1;
    private JTable table_1;

    private static Ingresar port;

    public void guardar() {
        try {
            Producto p = new Producto();
            ec.edu.ups.p2.services.GuardarProductos prodcuto;
           
            
        } catch (Exception ex) {
            Logger.getLogger(VentanaComprasProductos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    VentanaComprasProductos frame = new VentanaComprasProductos(port);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void cargarDatos() throws Exception {
        {
            System.out.println("Invoking getProductos...");
            try {
                java.util.List<ec.edu.ups.p2.services.Producto> _getProductos__return = port
                        .getProductos();

                Object[] columnas = {"Codigo", "Nombre", "Precio", "Stock"};
                Object[][] datos = new Object[_getProductos__return.size()][4];

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

                System.out.println("getProductos.result=" + _getProductos__return.toString());

            } catch (Exception_Exception e) {
                System.out.println("Expected exception: Exception has occurred.");
                System.out.println(e.toString());
            }
        }
    }
    

    /**
     * Create the frame.
     */
    public VentanaIngresarProductos(Ingresar port) {
        this.port = port;

        setTitle("Comprar");
        setMaximizable(true);
        setIconifiable(true);
        setClosable(true);
        setBounds(50, 50, 664, 509);
        getContentPane().setLayout(null);

        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(6, 329, 267, 42);
        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    cargarDatos();
                } catch (Exception e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }

            }
        });
        btnGuardar.setFont(new Font("Avenir", Font.PLAIN, 12));
        getContentPane().add(btnGuardar);

        scrollPane = new JScrollPane();
        scrollPane.setBounds(6, 6, 267, 126);
        getContentPane().add(scrollPane);

        table = new JTable();
        table.setFont(new Font("Avenir", Font.PLAIN, 12));

        table.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null},},
                new String[]{"Codigo", "Producto", "Precio", "Stock"}));
        scrollPane.setViewportView(table);
    }
}
