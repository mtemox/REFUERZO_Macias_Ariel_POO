package Practica_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creo un objeto Scanner para ingresar datos por teclado
        Scanner sc = new Scanner(System.in);
        // Creo un objeto tipo Estudiante
        Estudiante e1 = new Estudiante("Ariel", "3do Semestre", "Tecnología en Desarrollo de Software");
        // Creo un objeto tipo Docente
        Docente d1 = new Docente("Luis", 2);
        // Muestro infomracion antes
        System.out.println("\n-- INFORMACIÓN ANTES ---");
        e1.mostrarInformacion();
        d1.mostrarInformacion();
        // Ingreso los datos faltantes del estudiante por teclado
        System.out.println("\nInformación faltante del estudiante:");
        System.out.print("Ingrese el número de cedula: ");
        String cedula = sc.nextLine();
        e1.setCedula(cedula);
        System.out.print("Ingrese la dirección: ");
        String direccion = sc.nextLine();
        e1.setDireccion(direccion);
        // Ingreso los datos faltantes del docente por teclado
        System.out.println("\nInformación faltante del docente:");
        System.out.print("Ingrese el número de cedula: ");
        String cedula2 = sc.nextLine();
        d1.setCedula(cedula2);
        System.out.print("Ingrese la dirección: ");
        String direccion2 = sc.nextLine();
        d1.setDireccion(direccion2);
        // Muestro infomracion despues
        System.out.println("\n-- INFORMACIÓN DESPUES ---");
        e1.mostrarInformacion();
        d1.mostrarInformacion();
    }
}
