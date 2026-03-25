package proyecto.pkg2;

import javax.swing.UIManager;

public class Main {
    public static void main(String[] args) {
        try {

            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("No se pudo establecer el estilo visual: " + e.getMessage());
        }

        // Lanzamos la ventana principal
        java.awt.EventQueue.invokeLater(() -> {
 
            VentanaPrincipal ventana = new VentanaPrincipal();
            
            // La hacemos visible
            ventana.setVisible(true);
            
            // con esto se Centra la ventana 
            ventana.setLocationRelativeTo(null);
        });
    }
}