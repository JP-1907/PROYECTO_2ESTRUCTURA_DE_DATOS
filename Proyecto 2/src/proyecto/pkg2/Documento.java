package proyecto.pkg2;

public class Documento {
    private String nombre;
    private String usuario;
    private int etiquetaTiempo; 

    public Documento(String nombre, String usuario, int etiqueta) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.etiquetaTiempo = etiqueta;
    }

    public String getNombre() { return nombre; }
    public String getUsuario() { return usuario; }
    public int getEtiquetaTiempo() { return etiquetaTiempo; }
}