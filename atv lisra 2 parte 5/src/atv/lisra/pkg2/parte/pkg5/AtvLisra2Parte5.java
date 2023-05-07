
package atv.lisra.pkg2.parte.pkg5;

import java.util.Scanner;


public class AtvLisra2Parte5 {

  
    public static void main(String[] args) {
     /*
    atv1
     */  
      Scanner input= new Scanner (System.in);
      float preco1,preco2,preco3,valort;
    
      System.out.println("digite o o valor da primeira mercadoria 01/01");
      preco1=Float.valueOf(input.nextLine());
      System.out.println("digite o valor da segunda mercadoria01/02");
      preco2=Float.valueOf(input.nextLine());
      System.out.println("digite o valor da terceira mercadoria");
      preco3=Float.valueOf(input.nextLine()); 
        double preco1_1 = 0;
        double preco1_2 = 0;
        double preco2_1 = 0;
        double preco2_2 = 0;
        double preco3_1 = 0;
        double preco3_2 = 0;
        double inflacao = ((preco1_2 + preco2_2 + preco3_2) - (preco1_1 + preco2_1 + preco3_1)) / (preco1_1 + preco2_1 + preco3_1);
        String situacao = (inflacao > 0.0055) ? "acima" : "abaixo";
        System.out.printf("A inflação do período foi de %.2f%% e está %s da meta de 0,55%%", inflacao * 100, situacao);
      /*
        atv 17
        */
        
      
        
   

     
    }
}
