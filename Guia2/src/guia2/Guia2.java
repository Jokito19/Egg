/*
 Opinion de pelicula - Ejemplo del Video
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author Juaco
 */
public class Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opinion;
        Scanner leer = new Scanner(System.in);
        System.out.println("Clasifique la peli de 1 a 5 estrellas");
        opinion = leer.nextInt();
        if (opinion >= 1 && opinion <=5) {
            
            switch (opinion) {
                case 1:
                case 2:
                    System.out.println("nos sentimos apenados que no hayas disfrutado la peli...");
                    break;
                case 3:
                    System.out.println("Has calificado la peli como buena");
                    break;
                case 4:
                    System.out.println("Has calificado al peli como muy buena");
                    break;
                case 5:
                    System.out.println("Fantastico que haya disfrutado de un excelente entretenimietno!!");
                    break;
                    
                    //el equivalente al caso del *De otro modo* es ek *default*
                    //default:
                   //<acciones>
            }
        }else if (opinion < 0) {
            System.out.println("¿Una opinion negativa?¿Taaaaan mala fue la pelicula? :( ");
        }else if (opinion ==0) {
            System.out.println("el valor " + opinion + " no es valido y no e tomara en cuenta. :(");
        } else {
            System.out.println(opinion + "!Wow! se te fue la mano con la calificacion! :D");
        }
        System.out.println("Hasta la proxima");
       
            
        
           
            
            
            }
        }
        
        
                
                
        
    
    

