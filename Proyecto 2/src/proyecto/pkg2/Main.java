package proyecto.pkg2;

import javax.swing.UIManager;

public class Main {
    public static void main(String[] args) {
        try {

            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("No se pudo establecer el estilo visual: " + e.getMessage());
        }


        java.awt.EventQueue.invokeLater(() -> {
 
            VentanaPrincipal ventana = new VentanaPrincipal();
            

            ventana.setVisible(true);
            
 
            ventana.setLocationRelativeTo(null);
        });
    }
}
