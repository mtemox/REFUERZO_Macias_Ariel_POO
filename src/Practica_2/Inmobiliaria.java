package Practica_2;

public class Inmobiliaria {
    // Atributos de la superclase
    protected String modelo;
    protected int cantidadPisos;
    protected double metrosCuadrados;
    // Metodo constructor
    public Inmobiliaria(String modelo, int cantidadPisos, double metrosCuadrados) {
        this.modelo = modelo;
        this.cantidadPisos = cantidadPisos;
        this.metrosCuadrados = metrosCuadrados;
    }
    // Metodo que sobreescribirán las subclases
    public void mostrarInformacion() {
    }
}
