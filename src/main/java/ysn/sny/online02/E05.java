
package ysn.sny.online02;
import java.util.Scanner;
/**
 * Este método muestrae los 10 siguientes números pares a partir de uno introducido por teclado. 
 * @author Yvon
 * @version 1.0;
 */
public class E05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner resp = new Scanner(System.in);
        int num, i, fin = 0;
        
        System.out.print("Ingrese número: ");
        num = resp.nextInt();
        if (num%2 == 1) {
            num=num+1;
        }
        fin = num+18;
        for (i=num; i<=fin; i+=2){
            System.out.println(i + " ");
        }
        
    } 
    
}
