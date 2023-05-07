
package atividade.pkg17;

import java.util.Scanner;

public class Atividade17 {

    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        
        double parcelasTotais,parcelasPagas,valor,totalPago,saldoDevedor;
        
       System.out.print("digite a quantidade total de parcelas");
       parcelasTotais = Double.valueOf (input.nextLine());
       System.out.print("digite a quantidade  de parcelas ja pagas");
       parcelasPagas = Double.valueOf (input.nextLine());
        System.out.print("digite o valor de cada parcela");
       valor = Double.valueOf (input.nextLine());        
        
       totalPago = valor * parcelasPagas;
       saldoDevedor = (parcelasTotais - parcelasPagas) * valor;
        
       System.out.print("o total pago e:" + totalPago);
       System.out.print (" o saldo devedor e:" + saldoDevedor);
       /*
       atv18
       */
       
       
       int diaNascimento,mesNascimento,anoNascimento,diaAtual,mesAtual,anoAtual;
       System.out.println ("digite o dia do nascimento");
       diaNascimento = Integer.valueOf (input.nextLine());
       System.out.print ("digite o mes do nascimento");
       mesNascimento = Integer.valueOf (input.nextLine());
       System.out.print ("digite o ano do nascimento");
       anoNascimento = Integer.valueOf (input.nextLine());
       System.out.print ("digite o dia atual");
       diaAtual = Integer.valueOf (input.nextLine());
       System.out.print ("digite o mes atual");
       mesAtual = Integer.valueOf (input.nextLine());
       System.out.print ("digite o ano atual");
       anoAtual = Integer.valueOf (input.nextLine());
       
 
       int anosGloria = (anoAtual - anoNascimento)*360;
       int mesGloria = (mesAtual - mesNascimento)*30;
       int diaGloria = (diaAtual - diaNascimento)*24;
       
       int diaTotal = anosGloria + mesGloria + diaGloria;
       System.out.println ("o total de dias vividos e: " + diaTotal);
               
          /*
       atv19
       */ 
       System.out.print ("digite um numero entre 0 e 999");
       int numero = Integer.valueOf (input.nextLine());
      
        int soma = 0;
        int resto = 0;

        while (numero > 0) {
            resto = numero % 10; // obtem o último dígito do número
            soma += resto; // adiciona o último dígito à soma
            numero /= 10; // remove o último dígito do número
        }

        System.out.println("A soma dos dígitos é: " + soma);
        input.close();
    }
}
 
          
