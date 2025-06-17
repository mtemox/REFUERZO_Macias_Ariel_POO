package Practica_1;

public class Vehiculo {
    // Atributos de la clase
    private String placa;
    private double kilometraje = 0.00;
    // Metodo para saber el kilometraje actual
    public void kilometrajeActual() {
        System.out.println("Kilometraje actual: " + kilometraje + "km");
    }
    // Metodo set para kilometraje
    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
        System.out.println("El kilometraje cambio a: " + kilometraje + "km");
    }
}
