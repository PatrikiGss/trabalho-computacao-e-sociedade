/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista_04_exercicio_12;

import java.util.Scanner;

/**
 *
 * @author Ander
 */
public class Lista_04_Exercicio_12 {

    static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {
// Variáveis

        int num1, num2, num3;
        
// Entrada de dados

        System.out.print("Digite o primeiro número: ");
        num1 = Integer.valueOf(input.nextLine());
        
        System.out.print("Digite o segundo número: ");
        num2 = Integer.valueOf(input.nextLine());
        
        System.out.println("Digite o terceiro número: ");
        num3 = Integer.valueOf(input.nextLine());
        
// Processamento de dados

        verificaNumeroMenor(num1, num2, num3);
    }
    
    public static void verificaNumeroMenor (int num1, int num2, int num3){
        int menor;
        menor = Math.min(num1, num2);
        
        if (menor < num3){
            System.out.println("O menor número é: " + menor);
        } else {
            System.out.println("O menor número é: " + num3);
        }
    }
}

