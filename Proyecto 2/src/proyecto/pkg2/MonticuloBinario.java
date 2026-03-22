package proyecto.pkg2;

public class MonticuloBinario {
    private Documento[] nodos;
    private int tamaño;

    public MonticuloBinario() {
        // Capacidad para 100 documentos, empezamos en cero
        this.nodos = new Documento[100];
        this.tamaño = 0;
    }

    // --- MÉTODO PARA INSERTAR ---
    public void insertar(Documento nuevo) {
        if (tamaño >= nodos.length) return; // Cola llena

        nodos[tamaño] = nuevo;
        subir(tamaño);
        tamaño++;
    }

    // --- MÉTODO PARA ELIMINAR (EL QUE DABA ERROR) ---
    public Documento eliminar() {
        if (tamaño == 0) return null;

        Documento raiz = nodos[0];
        nodos[0] = nodos[tamaño - 1]; // Movemos el último a la cima
        tamaño--;

        if (tamaño > 0) {
            hundir(0); // Reordenamos hacia abajo
        }
        return raiz;
    }

    // --- LÓGICA DE ORDENAMIENTO (EL MOTOR) ---
    
    private void subir(int i) {
        int padre = (i - 1) / 2;
        // Si el hijo es menor que el padre, los intercambiamos (Min-Heap)
        if (i > 0 && nodos[i].getEtiquetaTiempo() < nodos[padre].getEtiquetaTiempo()) {
            intercambiar(i, padre);
            subir(padre);
        }
    }

    private void hundir(int i) {
        int izq = 2 * i + 1;
        int der = 2 * i + 2;
        int menor = i;

        // Buscamos cuál de los hijos es el más pequeño
        if (izq < tamaño && nodos[izq].getEtiquetaTiempo() < nodos[menor].getEtiquetaTiempo()) {
            menor = izq;
        }
        if (der < tamaño && nodos[der].getEtiquetaTiempo() < nodos[menor].getEtiquetaTiempo()) {
            menor = der;
        }

        // Si el menor no es el actual, intercambiamos y seguimos bajando
        if (menor != i) {
            intercambiar(i, menor);
            hundir(menor);
        }
    }

    private void intercambiar(int i, int j) {
        Documento temp = nodos[i];
        nodos[i] = nodos[j];
        nodos[j] = temp;
    }

    // --- MÉTODOS PARA QUE LA VENTANA PUEDA DIBUJAR ---
    public Documento[] getArreglo() {
        return nodos;
    }

    public int getTamaño() {
        return tamaño;
    }
}