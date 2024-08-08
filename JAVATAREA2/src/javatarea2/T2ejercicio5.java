
package javatarea2;

import java.util.Scanner;

public class T2ejercicio5 {

  
    public static void main(String[] args) {
       
         int meses;  
         String[] fechas = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
         
         System.out.println("ingrese la el numero de mes");
         
         Scanner in = new Scanner(System.in);
         meses = in.nextInt();
         
         if (meses >=1 && meses <= 12){
             System.out.println("Nombre de mes:" + fechas[meses - 1]);
         }else{
             System.out.println("numero del mes invalido");
         }
         
         
         
         
    }

   
    }
    

