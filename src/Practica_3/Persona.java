package Practica_3;

public class Persona {
    // Atributos de la clase
    protected String nombre;
    private String cedula;
    private String direccion;
    // Metodo constructor
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    // Metodos get y set para los atributos
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    // Metodo abstracto que modificaran las sublases
    public void mostrarInformacion() {
    }
}
