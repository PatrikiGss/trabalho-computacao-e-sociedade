
package teste.math.pkg2;

import java.util.Scanner;


public class TesteMath2 {

    
    public static void main(String[] args) {
    
   
        Scanner sc = new Scanner(System.in);
        double tampista, peso, visibilidade, chuva, passageiros;
        boolean sisdecola, decola;

        System.out.println("Digite o tamanho da pista: ");
        tampista = Double.valueOf(sc.nextLine());

        System.out.println("Digite o peso do avião: ");
        peso = Double.valueOf(sc.nextLine());

        System.out.println("Digite a visibilidade em metros: ");
        visibilidade = Double.valueOf(sc.nextLine());

        System.out.println("Digite a intensidade da chuva em mm: ");
        chuva = Double.valueOf(sc.nextLine());

        System.out.println("Digite a quantidade de passageiros: ");
        passageiros = Double.valueOf(sc.nextLine());

        System.out.println("O avião tem sistema de decolagem automatizada? (true/false)");
        sisdecola = Boolean.valueOf(sc.nextLine());

        decola = ((tampista < 1.5 && peso < 40) || (tampista >= 1.5 && tampista <= 2 && peso < 60) || (tampista > 2 && peso > 0)) && (visibilidade >= 20 || sisdecola) && (chuva < 5 || passageiros <= 100);

        System.out.println("O avião pode decolar? " + decola);
    }
}

  
    

