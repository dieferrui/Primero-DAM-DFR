import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaSaludo extends JFrame {

    public VentanaSaludo() {
        // Configuración de la ventana
        setTitle("Saluda!");
        setSize(500, 120);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Configuración del panel
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Etiqueta y campo de texto
        JLabel etiquetaNombre = new JLabel("Nombre: ");
        JTextField campoNombre = new JTextField(15);

        // Botón de Saludo
        JButton botonSaludar = new JButton("Saluda");
        botonSaludar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = campoNombre.getText();
                JOptionPane.showMessageDialog(VentanaSaludo.this, "¡Hola, " + nombre + "!", "Saludo", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Agregar componentes al panel
        panel.add(etiquetaNombre);
        panel.add(campoNombre);
        panel.add(botonSaludar);

        // Agregar panel a la ventana
        add(panel);

        // Hacer visible la ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        // Crear una instancia de la clase VentanaSaludo
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaSaludo();
            }
        });
    }
}