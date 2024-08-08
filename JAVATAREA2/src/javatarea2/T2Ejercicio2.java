
package javatarea2;
    
import java.util.Scanner;

class T2Ejercicio2 { 

public static void main(String[] args) {


    int a;
    int b;
    int c;
    
    
    Scanner in = new Scanner (System.in);
    System.out.println("Ingrese el primero valor entero:");
    a = in.nextInt();
    
    System.out.println("Ingrese el segundo valor entero");
    b = in.nextInt();
    
    System.out.println("Ingrese el tercer valor entero");
    c = in.nextInt();
    
    int mayor = a;
 
    if (b > mayor){
        mayor = b;
    }
    if (c > mayor){
        mayor = c;
        
    }
    
    System.out.println("El valor entero es:"+ mayor);
    }

   }
    
