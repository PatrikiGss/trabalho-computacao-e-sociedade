
package lista.pkg1.pt.pkg4;

import static java.lang.System.out;
import java.util.Scanner;


public class Lista1Pt4 {

    /*
    atv9
    */
    public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
    float qcafe,ccafe,lleite,cleite,bbolacha,cbolacha,gcafe,gleite,gbolacha,gall;    
    System.out.println("digite quantos quilos de cafe foram comprados");
    qcafe=Float.parseFloat(input.nextLine());
    System.out.println("qual o custo deste cafe?");
    ccafe=Float.parseFloat(input.nextLine());
    System.out.println("quantos litros de cafe foram comprados");
    lleite=Float.parseFloat(input.nextLine());
    System.out.println("quanto custou cada leite");
    cleite=Float.parseFloat(input.nextLine());
    System.out.println("quantos pacotes de bolacha foram comprados");
    bbolacha=Float.parseFloat(input.nextLine());
    System.out.println("quanto custou cada bolacha");
    cbolacha=Float.parseFloat(input.nextLine());
    gcafe=ccafe*qcafe;
    gleite=cleite*lleite;
    gbolacha=bbolacha*cbolacha;
    gall=gcafe+gleite+gbolacha;
    System.out.println("custo do cafe foi: "+gcafe);
    System.out.println("custo do leite foi: "+gleite);
    System.out.println("custo da bolacha foi: "+gbolacha);
    System.out.println("custo total foi: "+gall); 
      /*
        atv 10
        */ 
    int numero, quociente, resto;  
    System.out.println("digite o numero");
    numero=Integer.parseInt(input.nextLine());
    quociente=numero/2;
    resto=numero%2 ;
    System.out.println("quociente= " +quociente);
    System.out.println("resto= "+resto); 
     
    }
    
}
