
package atv.java.pkg4.lista.pkg4;

import java.util.Scanner;


public class AtvJava4Lista4 {

static Scanner input=new Scanner (System.in) ;



    public static void main(String[] args) {
       
        System.out.print("Digite um número inteiro: ");
        int n = input.nextInt();
        verificarParImpar(n);
      
    }

    public static void verificarParImpar(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " é par");
        } else {
            System.out.println(n + " é ímpar");
        }
    }
}

 