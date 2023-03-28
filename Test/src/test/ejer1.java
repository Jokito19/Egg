package ejer1;

import java.util.Scanner;


public class ejer1 {


    public static void main(String[] args) {
        // para hacer un enter en lo impreso se usa \n dentro de las comillas
      Scanner leer = new Scanner(System.in);
      int num;
      int num2;

      System.out.println("Ingrese un numero");
      num = leer.nextInt();
      
            System.out.println("Ingrese otro numero");
      num2 = leer.nextInt();
      
        System.out.println("La suma es " + (num + num2));
        
    }
    
}