
package ysn.sny.online02;
import java.util.Scanner;
/**
 * Este método comprueba si un número introducido por teclado es negativo. En caso afirmativo muestra el mensaje 
 * @author Yvon
 * @version 1.0
 */
public class E04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner resp = new Scanner(System.in);
        int num = 0;
        
        System.out.print("Ingrese un número: ");
        num = resp.nextInt();
        if (num<0) {
            System.out.println("El número introducido es negativo");   
        }
        
    }
    
}
