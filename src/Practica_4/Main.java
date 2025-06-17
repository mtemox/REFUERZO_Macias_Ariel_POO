package Practica_4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Creo un objeto Scanner para ingresar datos por teclado
        Scanner sc = new Scanner(System.in);
        // Creo un objeto tipo Persona
        Persona p1 = new Persona();
        int edad = -1;
        // Ingreso la edad por teclado
        while (edad < 0) {
            System.out.print("Ingrese la edad de la persona: ");
            edad = sc.nextInt(); sc.nextLine(); // Consumo el salto de linea
            p1.setEdad(edad);
        }
    }
}
