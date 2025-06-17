package Practica_3;

public class Docente extends Persona {
    // Atributos especificos de la clase
    private int numMateriasACargo;
    // Metodo constructor
    public Docente(String nombre, int numMateriasACargo) {
        super(nombre);
        this.numMateriasACargo = numMateriasACargo;
    }
    // Metodo sobreescrito
    @Override
    public void mostrarInformacion() {
        System.out.println("\nInformación del docente:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Cedula: " + getCedula());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Numero de materias a cargo: " + numMateriasACargo);
    }
    // Metodo específico
    public void rolDocente() {
        System.out.println("\nHola! soy docente.");
    }
}
