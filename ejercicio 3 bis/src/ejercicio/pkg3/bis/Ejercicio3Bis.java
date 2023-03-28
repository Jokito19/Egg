/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package ejercicio.pkg3.bis;

import java.util.Scanner;

/**
 *
 * @author Juaco
 */
public class Ejercicio3Bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String FRASE;
        
        System.out.println("Ingrese una frase");
        
        FRASE = leer.nextLine();
        
        System.out.println("Mayucusla"+FRASE.toUpperCase());
        System.out.println("Minuscula"+FRASE.toLowerCase());
        
    }
    
}
