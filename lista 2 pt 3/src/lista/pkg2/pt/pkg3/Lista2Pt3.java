
package lista.pkg2.pt.pkg3;

import java.util.Scanner;

public class Lista2Pt3 {

    public static void main(String[] args) {

   
/*
        apaguei a 9 sem querer mas a 10 n da liga na penultima pqp
        */
  
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho da pista em Km: ");
        double tamanhoPista = scanner.nextDouble();

        System.out.print("Digite o peso do avião em toneladas: ");
        double pesoAviao = scanner.nextDouble();

        System.out.print("Digite a visibilidade em metros: ");
        int visibilidade = scanner.nextInt();

        System.out.print("Digite a intensidade da chuva em mm (digite 0 se não estiver chovendo): ");
        double intensidadeChuva = scanner.nextDouble();

        System.out.print("Digite o número de passageiros: ");
        int numeroPassageiros = scanner.nextInt();

        System.out.print("O avião possui sistema de decolagem computadorizada (true/false)? ");
        boolean sistemaDecolagem = scanner.nextBoolean();

        boolean podeDecolar = (tamanhoPista < 1.5 && pesoAviao < 40) || (tamanhoPista >= 1.5 && tamanhoPista <= 2 && pesoAviao <= 60) || tamanhoPista > 2;
        podeDecolar = podeDecolar && (visibilidade >= 20 || sistemaDecolagem);
        podeDecolar = podeDecolar && (intensidadeChuva <= 5 || (intensidadeChuva > 5 && numeroPassageiros <= 100));

        System.out.println("O avião pode decolar? " + podeDecolar);
    }
}

            
            
           
    
        






 
