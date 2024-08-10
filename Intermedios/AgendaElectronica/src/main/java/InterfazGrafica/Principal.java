package InterfazGrafica;

import javax.swing.*;
import java.awt.*;

public class Principal extends JFrame {
    private JTextField txtFechaNac;
    private JTextField txtTelefono;
    private JTextField txtDireccion;
    private JTextField txtApellido;
    private JTextField txtNombre;
    private JTextField txtDni;
    private JButton btnBack;
    private JTextField txtIndice;
    private JButton btnSave;
    private JButton button1;
    private JPanel panelMain;

    public Principal() {
        // Configurar el JFrame
        setTitle("Interfaz Gráfica Principal");
        setSize(500, 400); // Establecer tamaño del JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar el JFrame

        // Inicializar los componentes
        txtFechaNac = new JTextField(15);
        txtTelefono = new JTextField(15);
        txtDireccion = new JTextField(15);
        txtApellido = new JTextField(15);
        txtNombre = new JTextField(15);
        txtDni = new JTextField(15);
        btnBack = new JButton("Back");
        txtIndice = new JTextField(15);
        btnSave = new JButton("Save");
        button1 = new JButton("Button1");

        // Crear el panel principal
        panelMain = new JPanel(new GridBagLayout());
        panelMain.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Añadir padding
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        // Configurar y agregar componentes al panel
        addComponent(panelMain, new JLabel("Fecha Nacimiento:"), gbc, 0, 0);
        addComponent(panelMain, txtFechaNac, gbc, 1, 0);
        addComponent(panelMain, new JLabel("Teléfono:"), gbc, 0, 1);
        addComponent(panelMain, txtTelefono, gbc, 1, 1);
        addComponent(panelMain, new JLabel("Dirección:"), gbc, 0, 2);
        addComponent(panelMain, txtDireccion, gbc, 1, 2);
        addComponent(panelMain, new JLabel("Apellido:"), gbc, 0, 3);
        addComponent(panelMain, txtApellido, gbc, 1, 3);
        addComponent(panelMain, new JLabel("Nombre:"), gbc, 0, 4);
        addComponent(panelMain, txtNombre, gbc, 1, 4);
        addComponent(panelMain, new JLabel("DNI:"), gbc, 0, 5);
        addComponent(panelMain, txtDni, gbc, 1, 5);
        addComponent(panelMain, new JLabel("Indice:"), gbc, 0, 6);
        addComponent(panelMain, txtIndice, gbc, 1, 6);
        addComponent(panelMain, btnSave, gbc, 0, 7);
        addComponent(panelMain, button1, gbc, 1, 7);
        addComponent(panelMain, btnBack, gbc, 0, 8);

        // Agregar el panel principal al JFrame
        setContentPane(panelMain);
    }

    private void addComponent(JPanel panel, Component component, GridBagConstraints gbc, int x, int y) {
        gbc.gridx = x;
        gbc.gridy = y;
        panel.add(component, gbc);
    }

    public static void main(String[] args) {
        // Configurar el Look and Feel a Nimbus
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Ejecutar la aplicación
        SwingUtilities.invokeLater(() -> {
            Principal principal = new Principal();
            principal.setVisible(true);
        });
    }
}
