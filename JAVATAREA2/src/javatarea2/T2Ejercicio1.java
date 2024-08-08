
package javatarea2;


import java.util.Scanner;


public class T2Ejercicio1 {

   
    public static void main(String[] args) {
      
        int a; //definir enteros
        int b;
        int mayor;
        
        Scanner in = new Scanner(System.in);
        
        //´primer entero
        System.out.println("Ingrese el primer numero entero");
        a = in.nextInt();
        
        //segungo entero
        System.out.println("Ingrese el segundo numero entero");
        b = in.nextInt();
        
        //logica de enteros mayor
        if (a > b){
            mayor = a;
            
        }else {
            mayor = b;
            }
        
        //imprimir resultado si es mayor
        System.out.println("Comparacion de numero mayor es:" + mayor);
    }
    
}
