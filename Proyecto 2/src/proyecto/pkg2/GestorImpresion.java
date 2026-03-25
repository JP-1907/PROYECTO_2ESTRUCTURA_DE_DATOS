package proyecto.pkg2;

public class GestorImpresion {
    private MonticuloBinario cola = new MonticuloBinario();
    private TablaHash usuarios = new TablaHash();

//Para agregar un documento
    public void agregarDocumento(String nombre, String usuario, boolean forzarPrio, int tam) {
        int prioridadFinal;
        String tipoEnTabla = usuarios.buscarTipo(usuario);

        if (forzarPrio || tipoEnTabla.equalsIgnoreCase("prioridad_alta")) {
            prioridadFinal = (tam < 10) ? tam : 5; 
        } else {
            prioridadFinal = 100 + tam; 
        }

        Documento nuevo = new Documento(nombre, usuario, prioridadFinal);
        cola.insertar(nuevo);
    }
//Imprimir el documento
    public Documento imprimirSiguiente() {
        return cola.eliminar();
    }

    public MonticuloBinario getCola() {
        return cola;
    }
}
