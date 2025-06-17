package Practica_2;

public class Main {
    public static void main(String[] args) {
        // Creo un arreglo con abojetos de tipo Inmobiliaria
        Inmobiliaria[] inmobiliarias = {    new Casa("Moderno", 2, 450.00, "Blanco"),
                                            new Hotel("Rústico", 5, 700.00, "Carolina") };
        // Llamo a los metodos
        for (Inmobiliaria in : inmobiliarias) {
            in.mostrarInformacion();
        }
    }
}
