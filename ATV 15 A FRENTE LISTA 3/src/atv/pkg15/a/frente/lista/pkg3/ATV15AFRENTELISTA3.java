
package atv.pkg15.a.frente.lista.pkg3;

import java.util.Scanner;

public class ATV15AFRENTELISTA3 {
    static Scanner input=new Scanner (System.in);
    public static void main(String[] args) {
            System.out.println("digite a idade so nadador");
    int idade =Integer.valueOf(input.nextLine());
   if(idade>=5&&idade<=10){
     System.out.println("categoria infantil");}
   else if(idade>=11&&idade<=17){
        System.out.println("categoria juvenil");}
   else if(idade>=18&&idade<=60){
       System.out.println("categoria adulto");}
   else{
            System.out.println("senior");}
      
 //atv 16
   
    float y,x;
    System.out.println("digite a primeira coordenada");
    x=Float.parseFloat(input.nextLine());
    System.out.println("digite a segunda coordenada");
    y=Float.parseFloat(input.nextLine());
    if(x>0&&y>0)
            System.out.println("coordenada 1");
    else if(x<0&&y>0)
            System.out.println("coordenada 2");
    else if(x>0&&y<0)
            System.out.println("coordenada 4");
    else if(x<0&&y<0)
            System.out.println("coordenada 3");
    else
            System.out.println("quadrante 0");
            

      
      
    }
}
