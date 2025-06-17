package Practica_4;

public class Persona {
    protected int edad;
    // Metodo de la superclase
    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
            System.out.println("La edad se registro con éxito");
        } else {
            System.out.println("Error: la edad debe ser un valor positivo. No actualizada. Vuelva a ingresarla.\n");
        }
    }
}
