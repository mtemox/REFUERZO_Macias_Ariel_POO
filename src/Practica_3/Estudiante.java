package Practica_3;

public class Estudiante extends Persona {
    // Atributos especificos de la clase
    private String carrera;
    private String semestre;
    // Metodo constructor
    public Estudiante(String nombre, String semestre, String carrera) {
        super(nombre);
        this.semestre = semestre;
        this.carrera = carrera;
    }
    // Metodo sobreescrito
    @Override
    public void mostrarInformacion() {
        System.out.println("\nInformación del estudiante:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Cedula: " + getCedula());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Carrera: " + carrera);
        System.out.println("Semestre: " + semestre);
    }
}
