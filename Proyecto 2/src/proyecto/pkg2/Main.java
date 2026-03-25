package proyecto.pkg2;

import javax.swing.UIManager;

public class Main {

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {

        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaPrincipal ventana = new VentanaPrincipal();
                

                ventana.setTitle("Interfaz Proyecto 2");
                

                ventana.setLocationRelativeTo(null);
                ventana.setVisible(true);
            }
        });
    }
}