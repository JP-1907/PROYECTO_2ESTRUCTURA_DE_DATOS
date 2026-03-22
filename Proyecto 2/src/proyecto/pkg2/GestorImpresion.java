package proyecto.pkg2;

// Este es el único import que necesitas aquí
import javax.swing.JOptionPane;

public class GestorImpresion {
    // 1. Usamos la clase MonticuloBinario (Asegúrate que el archivo se llame así)
    private MonticuloBinario cola = new MonticuloBinario();

    public void agregarDocumento(String nombre, String usuario, boolean esPrioritario, int tamaño) {
        // Si es prioritario prioridad 1 (va arriba), si no 10
        int prioridad = esPrioritario ? 1 : 10; 
        Documento nuevo = new Documento(nombre, usuario, prioridad);
        cola.insertar(nuevo);
        // Usamos JOptionPane para que el IMPORT no salga amarillo
        System.out.println("Documento agregado a la cola.");
    }

    public Documento imprimirSiguiente() {
        // Llamamos al método eliminar del montículo
        return cola.eliminar(); 
    }

    public MonticuloBinario getCola() {
        return cola;
    }

    public void registrarUsuario(String nombre, String prioridad) {
        // Esto es para que el botón de cargar CSV funcione
        System.out.println("Registro: " + nombre + " - " + prioridad);
    }
}
