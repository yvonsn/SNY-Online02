
package ysn.sny.online02;
import java.util.Scanner;
/**
 * Este método lee un número en pulgadas y lo convierte a centímetros.
 * @author Yvon
 * @version 1.0
 */
public class E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner resp = new Scanner(System.in);
        double pulgadas = 0;
        double centimetros = 0;
        
        System.out.println("Ejercicio cambio de pulgadas a centímetros");
        System.out.println("==========================================");
        System.out.print("Ingrese cantidad en pulgadas: ");
        pulgadas = resp.nextDouble(); 
        centimetros = (pulgadas*2.54);
        System.out.println( "Equivale a " + centimetros +" centímetros");
        
    }
    
}
