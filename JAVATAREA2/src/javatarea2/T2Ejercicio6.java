
package javatarea2;

import java.util.Scanner;


public class T2Ejercicio6 {


    public static void main(String[] args) {
        int año;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el año:");
        año = in.nextInt();
        
            if  ((año %4==0 && año % 100!=0) || (año % 400 == 0)){
            System.out.println("El año" + año + "es bisiesto");
        }else {
            System.out.println("El año" + año + "no es bisiesto");
        }
        
     
    }
    
}
