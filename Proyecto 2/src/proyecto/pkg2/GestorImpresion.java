package proyecto.pkg2;

public class GestorImpresion {

    private MonticuloBinario cola = new MonticuloBinario();

    public void agregarDocumento(String nombre, String usuario, boolean esPrioritario, int tamaño) {

        int prioridad = esPrioritario ? 1 : 10; 
        Documento nuevo = new Documento(nombre, usuario, prioridad);
        cola.insertar(nuevo);

        System.out.println("Documento agregado a la cola.");
    }

    public Documento imprimirSiguiente() {

        return cola.eliminar(); 
    }

    public MonticuloBinario getCola() {
        return cola;
    }

    public void registrarUsuario(String nombre, String prioridad) {

        System.out.println("Registro: " + nombre + " - " + prioridad);
    }
}
