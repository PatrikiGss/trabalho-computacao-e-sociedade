
package lista.pkg1.pt.pkg3;

import java.util.Scanner;


public class Lista1Pt3 {

   /*
    atv7
    */
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
       double picolet1=1.50,picolet2=2.00,picolet3=0.75,valortotal1,valortotal2,valortotal3,valortotal;
       float quantidade1,quantidade2,quantidade3;
       System.out.println("DIGITE A QUANTIDADE DE PICOLES N1");
       quantidade1=Float.valueOf(input.nextLine());
       System.out.println("DIGITE A QUANTIDADE DE PICOLES N2");
       quantidade2=Float.valueOf(input.nextLine());
       System.out.println("DIGITE A QUANTIDADE DE PICOLES N3");
       quantidade3=Float.valueOf(input.nextLine());
       valortotal1=picolet1*quantidade1;
       valortotal2=picolet2*quantidade2;
       valortotal3=picolet3*quantidade3;
       valortotal= valortotal1+ valortotal2+valortotal3;
        System.out.println("total arrecadado do tipo 1  foi: "+valortotal1);
        System.out.println("total arrecadado do tipo 2  foi: "+valortotal2);
        System.out.println("total arrecadado do tipo 3  foi: "+valortotal3);
        System.out.println("o total foi: "+ valortotal);
       /*
        atv8
        */
        double salariomin,quantidadevendida,valorvendas,comissao1,comissao2,vporcar,salario;
        System.out.println("valor do salario é?");
        salariomin= Double.valueOf(input.nextLine());
        System.out.println("quantidade de carros vendidos");
        quantidadevendida= Double.valueOf(input.nextLine());
        System.out.println("qual foi o valor total das vendas?");
        valorvendas= Double.valueOf(input.nextLine());
        comissao1=150.00*quantidadevendida;
        vporcar= valorvendas/quantidadevendida;
        comissao2=((vporcar*1.05)-vporcar)*quantidadevendida;
        salario=(salariomin*2)+comissao1+comissao2;
        System.out.println("o salario do homi é:"+ salario);
        
        
        
               
    }
    
}
