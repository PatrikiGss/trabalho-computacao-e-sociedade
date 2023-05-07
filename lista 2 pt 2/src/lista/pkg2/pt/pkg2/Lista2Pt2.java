
package lista.pkg2.pt.pkg2;

import java.util.Scanner;


public class Lista2Pt2 {

   
    public static void main(String[] args) {
      Scanner input= new Scanner (System.in);
      int prova1, prova2,trabalho,frequencia;
       boolean aprovado;
       System.out.println("digite a nota da prova 1");
       prova1=Integer.valueOf(input.nextLine());
       System.out.println("digite a nota da prova 2");
       prova2=Integer.valueOf(input.nextLine());
       System.out.println("digite a nota trabalhos");
       trabalho=Integer.valueOf(input.nextLine());
       System.out.println("qual a frequencia do aluno?");
       frequencia=Integer.valueOf(input.nextLine());
       aprovado=((trabalho>=7)||trabalho>=6&&frequencia>=90)&& (prova1>=6||prova2>=6) && (frequencia>=75);
       System.out.println("o aluno foi aprovado?: "+ aprovado);
              /* 
       atv 7
       */
              /*
   tamanho do ar condicionado pequeno= volume<100m3
   medio valume= >=100m3 e<500m3
   grande= volume>500m3
              */
      double comprimento,altura,largura,areapiso,areaparede,volume;
      boolean arp,arm,arg;
      System.out.println("digite o comprimento da sala"); 
      comprimento=Double.valueOf(input.nextLine());
      System.out.println("digite a altura da sala");
      altura=Double.valueOf(input.nextLine());
      System.out.println("digite a largura da sala");
      largura=Double.valueOf(input.nextLine());
      areapiso=comprimento*largura;
      areaparede=(altura*2)*(comprimento+largura);
      volume=altura*largura*comprimento;
      arp=volume<100;
      arm=volume>=100||volume<500;
      arg=volume>500;
        System.out.println("area total de piso sera de: "+areapiso);
        System.out.println("area total de parede para pintar sera de: "+areaparede);
        System.out.println("o volume total do local é: "+volume);
        System.out.println("ar pequeno? "+arp);
        System.out.println("ar medio? "+arm);
        System.out.println("ar grande? "+arg);
        
        
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
    }
    
}
