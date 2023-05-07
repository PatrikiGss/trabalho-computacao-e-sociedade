
package lista.pkg4;

import java.util.Scanner;

//atv 1
public class Lista4 {
static Scanner input= new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("digite a area ");
        int base=Integer.valueOf(input.nextLine());
        System.out.println("digite a altura");
        int altura=Integer.valueOf(input.nextLine());
        int area=calculearea(base,altura);
        int perimetro=calculeperimetro(base,altura);
        mostreresultado(area,perimetro);
       
       
       
    }
   public static int calculearea (int base,int altura){
   return base*altura;  
    
}
   public static int calculeperimetro(int base,int altura){
       return (base+altura)*2;
}
   public static void mostreresultado(int area,int perimetro){
       System.out.println("a areas é: "+area);
       System.out.println("o perimetro é: "+perimetro);
       
       
       
}
}