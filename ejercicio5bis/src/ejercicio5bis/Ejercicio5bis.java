/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */
package ejercicio5bis;

import java.util.Scanner;

/**
 *
 * @author Juaco
 */
public class Ejercicio5bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        double num1;
        System.out.println("Ingrese un numero");
               num1 = numero.nextInt();
               
        System.out.println("El doble del numero ingresado es: "+ num1*2 + " el tripe es " + num1*3+ "la raiz cuadrada es "+ Math.sqrt(num1));       
    }
    
}
