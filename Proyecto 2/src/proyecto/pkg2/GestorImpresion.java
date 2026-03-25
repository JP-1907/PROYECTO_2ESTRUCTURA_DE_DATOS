package proyecto.pkg2;

public class GestorImpresion {
    private MonticuloBinario cola = new MonticuloBinario();
    private TablaHash usuarios = new TablaHash();

    // Este método lo llama tu botón "Añadir"
    public void agregarDocumento(String nombre, String usuario, boolean forzarPrio, int tam) {
        int prioridadFinal;
        String tipoEnTabla = usuarios.buscarTipo(usuario);

        // Lógica de prioridad: Si es VIP o se marcó el CheckBox, prioridad alta (valor bajo)
        if (forzarPrio || tipoEnTabla.equalsIgnoreCase("prioridad_alta")) {
            prioridadFinal = (tam < 10) ? tam : 5; 
        } else {
            prioridadFinal = 100 + tam; // Prioridad baja
        }

        Documento nuevo = new Documento(nombre, usuario, prioridadFinal);
        cola.insertar(nuevo);
    }

    public Documento imprimirSiguiente() {
        return cola.eliminar();
    }

    public MonticuloBinario getCola() {
        return cola;
    }
}