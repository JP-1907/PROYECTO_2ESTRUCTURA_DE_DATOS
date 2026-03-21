/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg2;

public class TablaHash {
    private class NodoHash {
        String usuario, tipo;
        NodoHash siguiente;
        NodoHash(String u, String t) { this.usuario = u; this.tipo = t; }
    }

    private NodoHash[] tabla;
    private int tamaño;

    public TablaHash(int capacidad) {
        this.tamaño = capacidad;
        this.tabla = new NodoHash[capacidad];
    }

    private int hash(String llave) {
        return Math.abs(llave.hashCode()) % tamaño;
    }

    public void insertar(String usuario, String tipo) {
        int pos = hash(usuario);
        NodoHash nuevo = new NodoHash(usuario, tipo);
        if (tabla[pos] == null) tabla[pos] = nuevo;
        else {
            nuevo.siguiente = tabla[pos];
            tabla[pos] = nuevo;
        }
    }

    public String buscarTipo(String usuario) {
        int pos = hash(usuario);
        NodoHash temp = tabla[pos];
        while (temp != null) {
            if (temp.usuario.equalsIgnoreCase(usuario)) return temp.tipo;
            temp = temp.siguiente;
        }
        return "prioridad_baja";
    }
}