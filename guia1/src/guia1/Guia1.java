/*
 Crear un programa que dado un número determine si es par o impar.
 */
package guia1;

import java.util.Scanner;

/**
 *
 * @author Juaco
 */
public class Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num1 = leer.nextInt();
        if (num1%2 == 0) {
            System.out.println("el numero es par");
            
            }else{
            
            System.out.println("Es impar");
            
        }
        
        
        
    }
    
}
