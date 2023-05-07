
package atv.pkg2.lista.pkg4;

import java.util.Scanner;


public class Atv2Lista4 {
static Scanner input=new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("digite o numero 1");
        int n1=Integer.valueOf(input.nextLine());
        System.out.println("digite o numero 2");
        int n2=Integer.valueOf(input.nextLine());
        int soma=calculesoma(n1,n2);
        int subtração=calculesubtracao(n1,n2);
        int multiplicacao=calculemultiplicacao(n1,n2);
        int divisao=calculedivisao(n1,n2);
        mostreresultado(soma,subtração,multiplicacao,divisao);
    }
    static int calculesoma(int n1,int n2){
        return n1+n2;
}
static int calculesubtracao(int n1,int n2){  
    return n1-n2;
}  
static int calculemultiplicacao(int n1,int n2){
    return n1*n2;
}
static int calculedivisao(int n1,int n2){
    return n1/n2;
}
static void mostreresultado(int soma,int subtração,int multiplicacao,int divisao){
    System.out.println("a soma é: "+soma);
    System.out.println("a subtração é: "+subtração);
    System.out.println("a multiplicação é; "+multiplicacao);
    System.out.println("a divisão é: "+divisao);
    /////////
    int n1,n2;
    System.out.println("digite o numero 1");
    n1=Integer.valueOf(input.nextLine());
    System.out.println("digite o numero 2");
    n2=Integer.valueOf(input.nextLine());
    mostreresultado(n1,n2);
}
static void mostreresultado(int n1,int n2){
 Math.max(n1, n2);
    System.out.println("o  maior é: "+ Math.max(n1, n2));
    
}

}

