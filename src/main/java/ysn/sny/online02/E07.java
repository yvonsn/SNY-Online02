
package ysn.sny.online02;
import java.util.Scanner;
/**
 * Este método Realiza la división del número 100 entre uno introducido por el usuario y muestra el resultado. 
 * Posteriormente realiza la división del resultado obtenido entre otro número que introduzca 
 * el usuario y así sucesivamente hasta que este introduzca un 0 que finalizará el programa. 
 * @author Yvon
 * @version 1.0
 */
public class E07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner resp = new Scanner(System.in);
        double resul, num = 0;
        double x = 100;
        System.out.print("Ingrese un número: ");
        num = resp.nextDouble();
        //x = 100;
        
        while (num>0) {
            resul = x / num;
            System.out.println(x + " / " + num + " = " + resul);
            System.out.print("Ingrese un número: ");
            num = resp.nextDouble();
            x = resul;
        } 
        System.out.println("La división por cero no se puede realizar.");
    }
}
