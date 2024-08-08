
package javatarea2;

import java.util.Scanner;


public class Ejercicio3Java {

  
    public static void main(String[] args) {
      
       int edad;
       double mayor = 18;
       double menor = 0;
       
       Scanner in = new Scanner(System.in);
       System.out.println("Ingrese su edad:");
       edad = in.nextInt();
       
       if (edad >= 18){
           System.out.println("Mayor de edad");
       }else{
           System.out.println("Menor de edad");
       }
    }
    
}
