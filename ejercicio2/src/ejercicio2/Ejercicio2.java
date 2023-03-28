/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Juaco
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        
        String nombre;
        
        System.out.println("Ingrese su nombre");
        
        nombre = leer.nextLine();
        
        System.out.println("Hola, " + nombre);
    }
}
