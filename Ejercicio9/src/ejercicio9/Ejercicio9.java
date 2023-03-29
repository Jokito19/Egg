/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se 
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".  El programa 
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el 
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Juaco
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2= 0;
        int num3= 0; 
        
        
        
        
        do {  
            num3 = num3 + 1 ;
            System.out.println("Ingrese un numero (hasta 20 ingresos)"+num3+"suma"+num2);
            num1 = leer.nextInt();
            if (num1 > 0) {
            num2 = num1+num2;
            }
            if (num1 == 0) {
            System.out.println("Se capturó el numero cero");
            break;
        }
            if (num3 == 20) {
            System.out.println("la suma de los numeros elegidos es:" +num2      );
            break;
        }    
            
            
           
            
        } while (num3 != 20 || num1 == 0);
        
        
        
    }
    
}
