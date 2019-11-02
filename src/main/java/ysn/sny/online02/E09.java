
package ysn.sny.online02;
import java.util.Scanner;
/**
 * Esta clase lee un número entero por teclado e indica si es par o impar.
 * @author Yvon Salas
 * @version 1.0;
 */
public class E09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner resp = new Scanner(System.in);
        int num = 0;
        
        System.out.print("Ingrese un número: ");
        num = resp.nextInt();
        if (num % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
        
    }
    
}
