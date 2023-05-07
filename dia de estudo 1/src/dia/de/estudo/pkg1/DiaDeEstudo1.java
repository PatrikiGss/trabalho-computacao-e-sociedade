
package dia.de.estudo.pkg1;

import java.util.Scanner;


public class DiaDeEstudo1 {

    /*
    atv 3 e 4 juntas
    */
    public static void main(String[] args) {
       Scanner input= new Scanner (System.in);
       int n1,n2,quadradoatv3,quadradoatv4;
        System.out.println("digite o primeiro numero");
        n1=Integer.valueOf(input.nextLine());
        System.out.println("digite o segundo numero");
        n2=Integer.valueOf(input.nextLine());
        quadradoatv4= (n1+n2)*(n1+n2);
        quadradoatv3=(n1*n1)+(n2*n2);
        System.out.println("a soma dos quadrados é"+quadradoatv3);
        System.out.println("a soma dos quadrados é"+quadradoatv4);
    }
    
}
