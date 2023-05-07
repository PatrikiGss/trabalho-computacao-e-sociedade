
package lista.pkg3.pt2.pkg1;

import java.util.Scanner;


public class Lista3Pt21 {
static Scanner sc= new Scanner (System.in);
  
    public static void main(String[] args) {
      
        // atv 8
        String name;
        char categoria;
        double salario;
        
        System.out.println("digite o nome do funcionario");
        name=sc.nextLine();
        System.out.println("digite a categoria do funcionario");
        categoria=sc.nextLine().charAt(0);
        System.out.println("qual o salario atual do funcionario");
        salario=Double.parseDouble(sc.nextLine());
        
        switch(categoria){
            case 'a' -> {
                System.out.println("nome:"+ name);
                System.out.println("categoria: "+ categoria);
                System.out.println("salario: "+salario*1.10);
        }
            case'h' -> {
                System.out.println("nome:"+ name);
                System.out.println("categoria: "+ categoria);
                System.out.println( "salario: "+salario*1.10);
        }
            case'b' -> {
                System.out.println("nome:"+ name);
                System.out.println("categoria: "+ categoria);
                System.out.println( "salario: "+salario*1.15);
        }
            case 'd' -> {
                System.out.println("nome:"+ name);
                System.out.println("categoria: "+ categoria);
                System.out.println("salario: "+ salario*1.15);
        }
            case 'e' -> {
                System.out.println("nome: "+name);
                System.out.println("categoria: "+ categoria);
                System.out.println("salario: "+ salario*1.15);
        }
            case 'c' -> {
                System.out.println("nome:"+ name);
                System.out.println("categoria: "+ categoria);
                System.out.println("salario: "+ salario*1.25);
        }
            case 'f' -> {
                System.out.println("nome:"+ name);
                System.out.println("categoria: "+ categoria);
                System.out.println("salario: "+ salario*1.25);
        }
            default -> {
                System.out.println("nome:"+ name);
                System.out.println("categoria: "+ categoria);
                System.out.println("salario: "+ salario*1.30);
        }
    }
    }}
