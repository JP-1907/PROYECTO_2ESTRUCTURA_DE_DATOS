package proyecto.pkg2;

import javax.swing.UIManager;

public class Main {

    public static void main(String[] args) {
        // 1. Intentamos poner el diseño del sistema (Windows/Mac) para que se vea moderno
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            // Si falla, usa el diseño básico de Java
        }

        // 2. Ejecutamos la ventana en el hilo de eventos (Lo correcto en Java Swing)
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaPrincipal ventana = new VentanaPrincipal();
                
                // FORZAMOS EL TÍTULO AQUÍ TAMBIÉN
                ventana.setTitle("Interfaz Proyecto 2");
                
                // Centramos y mostramos
                ventana.setLocationRelativeTo(null);
                ventana.setVisible(true);
            }
        });
    }
}