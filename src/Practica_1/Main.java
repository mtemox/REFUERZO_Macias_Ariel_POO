package Practica_1;

public class Main {
    public static void main(String[] args) {
        // Creo una clase tipo Vehiculo
        Vehiculo v1 = new Vehiculo();
        // Llamo al metodo para asignarle un kilometraje
        v1.kilometrajeActual();
        v1.setKilometraje(80);
        v1.kilometrajeActual();
    }
}
