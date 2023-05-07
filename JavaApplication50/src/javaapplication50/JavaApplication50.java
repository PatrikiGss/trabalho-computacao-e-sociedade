
package javaapplication50;

import java.util.Scanner;


public class JavaApplication50 {
/*
    atv12 
    */
   
   public static void main(String[] args) {
   Scanner input=new Scanner(System.in);
   float preçokg=(float)39.90,tara=450,gramas,valorapagar;
       System.out.println("digite quantas gramas foi o prato"); 
       gramas=Float.valueOf(input.nextLine());
       valorapagar=((gramas-tara)/1000)*preçokg;
       System.out.println("valor do prato: "+valorapagar);
      /**
       * atv 15
       */
       float peso,peso1,peso2; 
       System.out.println("digite o peso ");
       peso=Float.valueOf(input.nextLine());
       peso1=   (float) (peso*1.15);
       peso2= (float) (peso*1.20);
       System.out.println("apos ganho de 15% o peso é: "+peso1);
       System.out.println("apos ganho de 20% o peso é: "+peso2);
/*
       atv 16 altima lista 1
       */
        double salario=1500.00,c1=200.00,c1f,c2=120.00,c2f,restosalario;
       c1f=c1*1.02;
       c2f=c2*1.02;
       restosalario=(salario-c1f) -c2f; 
       System.out.println("resto do salario de joao é: "+restosalario);
    }

    private static void peso2(double d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
