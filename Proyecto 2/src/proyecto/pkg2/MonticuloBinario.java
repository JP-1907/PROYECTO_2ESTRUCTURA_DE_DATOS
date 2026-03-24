package proyecto.pkg2;

public class MonticuloBinario {
    private Documento[] nodos;
    private int tamaño;

    public MonticuloBinario() {

        this.nodos = new Documento[100];
        this.tamaño = 0;
    }


    public void insertar(Documento nuevo) {
        if (tamaño >= nodos.length) return; 
        nodos[tamaño] = nuevo;
        subir(tamaño);
        tamaño++;
    }


    public Documento eliminar() {
        if (tamaño == 0) return null;

        Documento raiz = nodos[0];
        nodos[0] = nodos[tamaño - 1]; 
        tamaño--;

        if (tamaño > 0) {
            hundir(0); 
        }
        return raiz;
    }


    
    private void subir(int i) {
        int padre = (i - 1) / 2;

        if (i > 0 && nodos[i].getEtiquetaTiempo() < nodos[padre].getEtiquetaTiempo()) {
            intercambiar(i, padre);
            subir(padre);
        }
    }

    private void hundir(int i) {
        int izq = 2 * i + 1;
        int der = 2 * i + 2;
        int menor = i;


        if (izq < tamaño && nodos[izq].getEtiquetaTiempo() < nodos[menor].getEtiquetaTiempo()) {
            menor = izq;
        }
        if (der < tamaño && nodos[der].getEtiquetaTiempo() < nodos[menor].getEtiquetaTiempo()) {
            menor = der;
        }


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


    public Documento[] getArreglo() {
        return nodos;
    }

    public int getTamaño() {
        return tamaño;
    }
}
