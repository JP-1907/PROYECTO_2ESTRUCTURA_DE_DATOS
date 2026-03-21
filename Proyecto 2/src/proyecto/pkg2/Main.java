package proyecto.pkg2;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {
    public static void main(String[] args) {
        // 1. Intentamos poner un diseño más moderno (opcional)
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | 
                 IllegalAccessException | UnsupportedLookAndFeelException e) {
            // Si falla, usará el diseño por defecto de Java
        }

        // 2. Iniciamos la interfaz de forma segura
        java.awt.EventQueue.invokeLater(() -> {
            // Creamos la ventana
            VentanaPrincipal ventana = new VentanaPrincipal();
            
            // Título de la ventana (para que se vea profesional)
            ventana.setTitle("Sistema de Gestión de Impresión - UNIMET");
            
            // La centramos en la pantalla
            ventana.setLocationRelativeTo(null);
            
            // La hacemos aparecer
            ventana.setVisible(true);
        });
    }
}