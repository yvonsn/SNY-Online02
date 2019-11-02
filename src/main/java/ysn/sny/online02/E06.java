
package ysn.sny.online02;
import java.util.Scanner;
/**
 * Este método lee dos números, muestra un menú si es 1 sumará los números y si es dos los restará y muestra el resultado.
 * @author Yvon
 * @version 1.0
 */
public class E06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner resp = new Scanner(System.in);
        int num1, num2, opc = 0;
        
        System.out.print("Ingrese 1er número: ");
        num1 = resp.nextInt();
        System.out.print("Ingrese 2do número: ");
        num2 = resp.nextInt();
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.print("Escoja una opción: ");
        opc = resp.nextInt();
        switch (opc) {
            case 1: 
                System.out.println(num1+num2);
                break;
            case 2: 
                System.out.println(num1-num2);
                break;    
        }
        
    }
    
}
