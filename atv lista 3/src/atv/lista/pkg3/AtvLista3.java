
package atv.lista.pkg3;

import java.util.Scanner;

public class AtvLista3 {

    static Scanner input= new Scanner (System.in);
    public static void main(String[] args) {
        String nome1,nome2,nome3;
       float quantidadeestoque1,quantidadeestoque2,quantidadeestoque3;
        System.out.println("digite o nome do primero produto");
        nome1=input.nextLine();
        System.out.println("digite o nome do segundo produto");
        nome2=input.nextLine();
        System.out.println("digite o nome do terceiro produto");
        nome3=input.nextLine();
       
       
       System.out.println("quantidade de estoque do primeiro produto");
       quantidadeestoque1=Float.valueOf(input.nextLine());
       System.out.println("quantidade de estoque do segundo produto ");
       quantidadeestoque2=Float.valueOf(input.nextLine());
       System.out.println("quantidade estoque do terceiro produto");
       quantidadeestoque3=Float.parseFloat(input.nextLine());
       
       if(quantidadeestoque1<=30)
            System.out.println("estoque abaixo do esperado para o produto 1");
       else if(quantidadeestoque1>30)
            System.out.println("estoque na media do produto 1");
       if(quantidadeestoque2<=30)
            System.out.println("estoque abaixo do esperado para o produto 2");
       else if(quantidadeestoque2>30)
            System.out.println("estoque na media do produto 2");
       if(quantidadeestoque3<=30)
            System.out.println("estoque abaixo do esperado para o produto 3");
       else if(quantidadeestoque3>30)
            System.out.println("estoque na media do produto 3");
       ////////////////////////////////////////////////////////////////
           float h;
        char genero;
        System.out.println("digite a altura");
       h=Float.valueOf(input.nextLine());
        System.out.println("digite o genero (m ou f) ");
       genero=input.nextLine().charAt(0);
        switch(genero){
            case 'm':System.out.println(72.7*h-58);
            break;
            case 'f':System.out.println(62.1*h-44.7);
            break;
            default: System.out.println(" genero invalido");}
/////////////////////////////////////////////////////////////////////////
      String nome;
      int idade,futuro;
      System.out.println("digite seu nome"); 
      nome=input.nextLine();
      
      System.out.println("digite sua idade");
      idade=Integer.valueOf(input.nextLine());
      
     
      
      
      while (idade<0 || idade>100){
      System.out.println("digite a idade novamente");
      idade=Integer.valueOf(input.nextLine());
    }
      futuro=idade+5;
      System.out.println(futuro);   
      /////////////////////////////////
              int angulo = Integer.valueOf(input.nextLine());
       if(angulo>90)
            System.out.println("abtuso");
       else if(angulo==90)
            System.out.println("reto");
       else
            System.out.println("agudo");
       ///////////////////////////////////////////////////
        System.out.print("Digite a hora (0-23): ");
        int hora = input.nextInt();
        System.out.print("Digite o minuto (0-59): ");
        int minuto = input.nextInt();
        System.out.print("Digite o segundo (0-59): ");
        int segundo = input.nextInt();

        segundo++;

        if (segundo == 60) {
            segundo = 0;
            minuto++;
            if (minuto == 60) {
                minuto = 0;
                hora++;
                if (hora == 24) {
                    hora = 0;
                }
            }
        }

        System.out.println("Horário acrescido de 1 segundo: %02d:%02d:%02d"+ hora + minuto + segundo);
        ////////////////////////////////////////////////////
         int x,y,z;
        System.out.println("digite os dados de x");
        x=Integer.valueOf(input.nextLine());
        System.out.println("digote os dados de y");
        y=Integer.valueOf(input.nextLine());
        System.out.println("digite os dados de z");
        z=Integer.valueOf(input.nextLine());
        
            
        if (x < y + z && y < x + z && z < x + y) {
            if (x == y && y == z) {
                System.out.println("Triângulo equilátero");
            } else if (x == y || x == z || y == z) {
                System.out.println("Triângulo isósceles");
            } else {
                System.out.println("Triângulo escaleno");
            }
        } else {
            System.out.println("Não é triângulo");
        }
    }
    
}
