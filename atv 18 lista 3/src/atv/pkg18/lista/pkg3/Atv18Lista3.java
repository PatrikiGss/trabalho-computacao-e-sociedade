
package atv.pkg18.lista.pkg3;

import java.util.Scanner;


public class Atv18Lista3 {
static Scanner input=new Scanner (System.in);
    
    public static void main(String[] args) {
        int pesoterra,planeta;
        System.out.println("digite o seu peso na atmosfera terrestre");
        pesoterra=Integer.parseInt(input.nextLine());
        System.out.println("digite o codigo do planeta");
        System.out.println("1=mercurio");
        System.out.println("2=venus");
        System.out.println("3=marte");
        System.out.println("4=jupiter");
        System.out.println("5=saturno");
        System.out.println("6=urano");
        System.out.println("7=netuno");
        planeta=Integer.valueOf(input.nextLine());
        double pesoplaneta;
        switch(planeta){
            case 1://mercurio
                pesoplaneta=pesoterra*0.37;
                System.out.println("seu peso em mercurio é de: " +pesoplaneta);
                break;
                case 2://venus
                pesoplaneta=pesoterra*0.88;
                System.out.println("seu peso em venus é de: " +pesoplaneta);
                break;
                case 3://marte
                pesoplaneta=pesoterra*0.38;
                System.out.println("seu peso em marte é de: " +pesoplaneta);
                break;
                case 4://jupiter
                pesoplaneta=pesoterra*2.64;
                System.out.println("seu peso em jupiter é de: " +pesoplaneta);
                break;
                case 5://saturno
                pesoplaneta=pesoterra*1.15;
                System.out.println("seu peso em saturno é de: " +pesoplaneta);
                break;
                case 6://urano
                pesoplaneta=pesoterra*1.17;
                System.out.println("seu peso em urano é de: " +pesoplaneta);
                break;
                case 7://netuno
                pesoplaneta=pesoterra*1.18;
                System.out.println("seu peso em netuno é de: " +pesoplaneta);
                break;
                default: System.out.println("codigo de planeta invalido");
                break;
                //atv18
        
      
      
  
}
}}