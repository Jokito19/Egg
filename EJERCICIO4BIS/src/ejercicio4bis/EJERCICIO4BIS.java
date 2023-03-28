/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ejercicio4bis;

import java.util.Scanner;

/**
 *
 * @author Juaco
 */
public class EJERCICIO4BIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        double grados;
        System.out.println("Ingrese los grados centigrados");
        grados = numero.nextDouble();
        double gradosf = 32 + ((9*grados)/5);
        System.out.println("Grados en F "+ gradosf);
    }
    
}
