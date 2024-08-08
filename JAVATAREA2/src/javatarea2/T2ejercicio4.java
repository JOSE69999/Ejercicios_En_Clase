
package javatarea2;

import java.util.Scanner;


public class T2ejercicio4 {

    
    public static void main(String[] args) {
        
        int entero;
      
        
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el numero entero:");
        entero = in.nextInt();
        
        if (entero > 0){
            System.out.println("Numero positivo");
        }else if (entero < 0){
            System.out.println("Nimero negativo");
        }else{
            System.out.println("El numero es 0");
        }
    }
    
}
