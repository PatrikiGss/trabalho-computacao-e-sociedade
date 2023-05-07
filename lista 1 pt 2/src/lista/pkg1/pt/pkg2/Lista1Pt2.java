
package lista.pkg1.pt.pkg2;

import java.util.Scanner;


public class Lista1Pt2 {

 /*
    atv5 
    */  
    public static void main(String[] args) {
     Scanner input= new Scanner(System.in);
     int base,altura,area,perimetro;
        System.out.println("digite os valores da base");
        base=Integer.valueOf(input.nextLine());
        System.out.println("digite os valores da altura");
        altura=Integer.valueOf(input.nextLine());
        area=base*altura;
        perimetro=(base+altura)*2;
        System.out.println("a area é "+area);
        System.out.println("o périmetro é "+perimetro);
        /* 
        atv 6
        */
        float tc,tf;
        System.out.println("DIGITE A TEMPERATURA EM CELSIUS");
        tc=Float.valueOf(input.nextLine());
        tf=(9*tc+160)/5;
        System.out.println("a temoperatura em fahrenheit é "+tf);
       
        
    }
    
}
