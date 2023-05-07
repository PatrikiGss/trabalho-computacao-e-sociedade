
package atv.pkg6.lista.pkg4;

import java.util.Scanner;

public class Atv6Lista4 {
static Scanner input= new Scanner (System.in);
    public static void main(String[] args) {
       String nome;
       float nota;
        System.out.println("digite o nome do aluno");
        nome=input.nextLine();
        System.out.println("qual foi a nota do aluno?");
        nota=Float.valueOf(input.nextLine());
        System.out.println("nome" +nome);
        System.out.println("nota" + nota);
        mostreconceito(nota); 
    }
    static void mostreconceito(float nota){
    if(nota>=0&&nota<=49)
            System.out.println("foi insuficiente");
    else 
        if(nota>=50&&nota<=64)
            System.out.println("regular");
        else 
            if(nota>=65&&nota<=84)
                System.out.println("bom");
            else
                if(nota>=85&&nota<=100)
                    System.out.println("otimo");
    else
                    System.out.println("nota invalida");
}
}
