package Practica_2;

public class Casa extends Inmobiliaria {
    //Atributo adicional de la clase
    private String color;
    // Metodo constructor
    public Casa(String modelo, int cantidadPisos, double metrosCuadrados, String color) {
        super(modelo, cantidadPisos, metrosCuadrados);
        this.color = color;
    }
    // Metodo sobreescrito
    @Override
    public void mostrarInformacion() {
        System.out.println("\nModelo de la casa: " + modelo);
        System.out.println("Cantidad de piso: " + cantidadPisos);
        System.out.println("Metros cuadrados: " + metrosCuadrados + "m2");
        System.out.println("Color: " + color);
    }
}
