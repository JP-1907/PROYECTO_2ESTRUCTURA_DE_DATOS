
package proyecto.pkg2;

public class TablaHash {
    private class NodoHash {
        String usuario, tipo;
        NodoHash siguiente;
        NodoHash(String u, String t) { this.usuario = u; this.tipo = t; }
    }

    private NodoHash[] tabla;
    private int capacidad = 100;

    public TablaHash() {
        this.tabla = new NodoHash[capacidad];
    }

    private int calcularHash(String llave) {
        return Math.abs(llave.hashCode()) % capacidad;
    }

    public void insertar(String usuario, String tipo) {
        int pos = calcularHash(usuario);
        NodoHash nuevo = new NodoHash(usuario, tipo);
        nuevo.siguiente = tabla[pos];
        tabla[pos] = nuevo;
    }

    public String buscarTipo(String usuario) {
        int pos = calcularHash(usuario);
        NodoHash temp = tabla[pos];
        while (temp != null) {
            if (temp.usuario.equalsIgnoreCase(usuario)) return temp.tipo;
            temp = temp.siguiente;
        }
        return "normal";
    }
}