
package ysn.sny.online02;
import java.util.Scanner;
/**
 * Este método lee dos números por teclado. Muestra la suma, resta, multiplicación y división de ambos números.
 * @author Yvon
 * @version 
 */
public class E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner resp = new Scanner(System.in);
        int num1, num2 = 0;
        
        System.out.print("Ingrese 1er nùmero: ");
        num1 = resp.nextInt();
        System.out.print("Ingrese 2do nùmero: ");
        num2 = resp.nextInt();
        System.out.println("La suma es: " + (num1 + num2));
        System.out.println("La resta es: " +(num1 - num2));
        System.out.println("La multiplicación es: " + (num1*num2));
        System.out.println("La división es: " + (num1/num2));
        
    }
    
}
