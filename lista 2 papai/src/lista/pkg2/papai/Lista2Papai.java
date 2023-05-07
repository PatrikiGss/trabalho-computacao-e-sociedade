
package lista.pkg2.papai;

import java.util.Scanner;

public class Lista2Papai {
/*
    lista 2 atv 1
    */
    
    public static void main(String[] args) {
   boolean expr1=5+3*6/2>=10;
   boolean expr2=36/3*2-5+8==27;
   boolean expr3=!(30/4*6==15);
   boolean expr4=(30%4*6==12)||true;
   boolean expr5=(5 * 7 % 3) + 4 / 2 + 5 == 12 && (12 / 4 < 8);
   boolean expr6=(((5 * 7 % 3 + 5) / 2 + 5) <= 14) || (! (12 / 4 < 8 * 2));
        System.out.println("resultado1; "+expr1);    
        System.out.println("resultado2; "+expr2);
        System.out.println("resultado3; "+expr3);
        System.out.println("resultado4; "+expr4);
        System.out.println("resultado5; "+expr5);
        System.out.println("resultado6; "+expr6);
        /*
        atv 2/3
        */
        Scanner input= new Scanner (System.in);
        float preço,kw,conta,ematraso;
        boolean consumo;
        System.out.println("digite o preço do quilowatt");
        preço=Float.valueOf(input.nextLine());
        System.out.println("digite os quilowatts gastos");
        kw=Float.valueOf(input.nextLine());
        System.out.println("a residencia se encontra em estado de gasto elevado?");
        consumo=kw>=70;
        conta=preço*kw;
        ematraso=(float) ((preço*kw)*1.10);
        System.out.println("conta em dia: "+ conta);
        System.out.println("conta em atraso: "+ematraso);
        System.out.println("situaçao do consumo alta? "+consumo);
        /* 
        atv 4
        */
       float peso,altura,imc;
       boolean acimadopeso;
        System.out.println("digite o peso da pessoa");
        peso=Float.parseFloat(input.nextLine());
        System.out.println("digite a altura da pessoa");
        altura=Float.parseFloat(input.nextLine());
        imc=peso/(altura*altura);
        System.out.println("o imc é "+imc);
       acimadopeso=imc >=25;
        System.out.println("esta acima do peso?"+acimadopeso);
       
        
                
        
        
        
        
    }
    
}
