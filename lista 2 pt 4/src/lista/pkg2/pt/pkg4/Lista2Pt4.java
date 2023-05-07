
package lista.pkg2.pt.pkg4;

import java.util.Scanner;


public class Lista2Pt4 {

    /*
    atv 11
    */
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        System.out.println("distancia em km");
        float distance=Float.parseFloat(input.nextLine());
        System.out.println("qual o consumo medio do carro?");
        float consumo=Float.parseFloat(input.nextLine());
        System.out.println("qaunto ta o gaz papai??");
        float preço= Float.parseFloat(input.nextLine());
        float litros= distance/consumo;
        float gasto= litros*preço;
        System.out.println("o gasto foi:"+gasto);
        /*
        atv 12
        */
          float n1,n2;
          System.out.println("digite o numero 1");
          n1=Float.valueOf(input.nextLine());
          System.out.println("digite o numero 2");
          n2=Float.valueOf(input.nextLine());
          if(n1==n2)
              System.out.println("os numeros sao iguais");
          else
              System.out.println("os numero sao diferentes");
          
          
        /*
        atv13
        */
        
         double nu1,nu2,nu3;
        
         System.out.println("digite o numero 1");
         nu1=Double.valueOf(input.nextLine());
         System.out.println("digite o numero 2");
         nu2=Double.valueOf(input.nextLine());
         System.out.println("digite o numero 3");
         nu3=Double.valueOf(input.nextLine());
     if (nu1+nu2<=nu3) {
            System.out.println("a soma de a+b é menor ou igual a c");}
     else{
            System.out.println("a soma se torna maior que c");}
         
         /*
     atv 14
     */
        double pt,math,cg,media;
        boolean aprovado;
       
        System.out.print("digite o nome do aluno");
        String nome = input.nextLine();
        System.out.println("digite a nota do aluno em portugues");
        pt=Double.valueOf(input.nextLine());
        System.out.println("digite a nota do aluno em matematica");
        math=Double.valueOf(input.nextLine());
        System.out.println("digite a nota do aluno em conhecimentos gerais");
        cg=Double.valueOf(input.nextLine());
        media=(pt+math+cg)/3;
        aprovado=(media>=7)&&(pt>5&&math>5&&cg>5);
        System.out.println("nome:"+nome);
        System.out.println("pt"+pt);
        System.out.println("mat"+math);
        System.out.println("conhecimentos gerais"+cg);
        System.out.println("situaçao aprovado?"+aprovado);
        /**
        atv 15
         */
        double salariob,inss,ir,auxilio,nauxilio,salariol;
        System.out.println("digiter o salario bruto");
        salariob=Double.valueOf(input.nextLine());
        System.out.println("quantos dependentes há?");
        auxilio=Double.valueOf(input.nextLine());
        inss=salariob*0.11;
        ir=salariob*0.15;
        nauxilio=auxilio*150.0;
        salariol=salariob-inss-ir+nauxilio;
        System.out.println("salario liquido é"+ salariol);
        
        
        
                
         
         
              
        
        
        
        
        
    }

    }
    

