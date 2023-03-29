/*
 Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima 
el número ingresado seguido de tantos asteriscos como indique su valor. 
Por ejemplo:
5 *****
3 ***
11 ***********
2 **

 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Juaco
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int num4;
        System.out.println("Ingrese 4 numeros comprendidos entre 1 y 20");

        //numero 1
        System.out.println("Ingrese el numero 1");
        num1 = leer.nextInt();
        while (num1 < 1 || num1 > 20) {

            System.out.println("Ingresar el numero 1 nuevamente");
            num1 = leer.nextInt();
        }
        //numero 2
        System.out.println("Ingrese el numero 2");
        num2 = leer.nextInt();
        while (num2 < 1 || num2 > 20) {

            System.out.println("Ingresar el numero 2 nuevamente");
            num2 = leer.nextInt();
        }
        //numero 3
        System.out.println("Ingrese el numero 3");
        num3 = leer.nextInt();
        while (num3 < 1 || num3 > 20) {

            System.out.println("Ingresar el numero 3 nuevamente");
            num3 = leer.nextInt();
        }
        //numero 4
        System.out.println("Ingrese el numero 4");
        num4 = leer.nextInt();
        while (num4 < 1 || num4 > 20) {

            System.out.println("Ingresar el numero 4 nuevamente");
            num4 = leer.nextInt();
        }

        //impresion num 1
        System.out.print(num1 + " ");
        for (int i = 0; i < num1; i++) {
            System.out.print("*");
        }
        System.out.println(" ");

        //impresion num 2
        System.out.print(num2 + " ");
        for (int i = 0; i < num2; i++) {
            System.out.print("*");
        }
        System.out.println(" ");

        //impresion num3
        System.out.print(num3 + " ");
        for (int i = 0; i < num3; i++) {
            System.out.print("*");
        }
        System.out.println(" ");

        //impresion num 4 
        System.out.print(num4 + " ");
        for (int i = 0; i < num4; i++) {
            System.out.print("*");
        }
        System.out.println(" ");

    }

}
