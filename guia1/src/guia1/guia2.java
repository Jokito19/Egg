/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” 
el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de 
Incorrecto. Nota: investigar la función equals() en Java.
 */
package guia1;

import java.util.Scanner;

/**
 *
 * @author Juaco
 */
public class guia2 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
     
        if (frase.equalsIgnoreCase("eureka")){
            System.out.println("COrrecto");
            
        }else{
            
            System.out.println("Incorrecto");
        } while (frase.equalsIgnoreCase("eureka"));
        
        }
        }
}
}
       

           
                   
       
    
    
