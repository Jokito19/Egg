/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Juaco
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double gradoC;
     
        System.out.println("Ingrese los grados centigrados (para decimal utilizar la coma)");
        
        gradoC = leer.nextDouble();
        
        double gradoF = 32 + (9*gradoC/5);
        
        System.out.println("Valor en farenheit: "+gradoF+"°F");
        
    }
}
