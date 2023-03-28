/*
 *Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, 
el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Juaco
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);

        double num;
        
        System.out.println("Ingrese un numero");
        
        num = leer.nextDouble();
        
        System.out.println("El doble de "+num+" es " +(num*2)+"\n"+"El triple de "+num+" es " +(num*3)+"\n"+"la raiz de "+num+" es " +Math.sqrt(num));
    }
}