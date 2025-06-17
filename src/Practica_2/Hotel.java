package Practica_2;

public class Hotel extends Inmobiliaria {
    //Atributo adicional de la clase
    private String sector;
    // Metodo constructor
    public Hotel(String modelo, int cantidadPisos, double metrosCuadrados, String sector) {
        super(modelo, cantidadPisos, metrosCuadrados);
        this.sector = sector;
    }
    // Metodo sobreescrito
    @Override
    public void mostrarInformacion() {
        System.out.println("\nModelo del hotel: " + modelo);
        System.out.println("Cantidad de pisos: " + cantidadPisos);
        System.out.println("Metros cuadrados: " + metrosCuadrados + "m2");
        System.out.println("Sector ubicado: " + sector);
    }
}
