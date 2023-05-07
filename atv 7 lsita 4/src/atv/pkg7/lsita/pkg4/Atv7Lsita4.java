
package atv.pkg7.lsita.pkg4;

import java.util.Scanner;


public class Atv7Lsita4 {
static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
     double saldo,juros=0.12; 
        System.out.println("digite o saldo da pessoa");
        saldo=Double.parseDouble(input.nextLine());
        mostreresultado(saldo,juros);
    }
    static void mostreresultado(double saldo,double juros){
    double juros1=(saldo*juros);
    double valor=saldo-juros1;
        System.out.println("o novo valor é: "+valor);
}
}
