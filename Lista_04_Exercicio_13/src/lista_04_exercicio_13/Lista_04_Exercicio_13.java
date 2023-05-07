/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista_04_exercicio_13;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lista_04_Exercicio_13 {

    static Scanner input = new Scanner (System.in);
    
    public static void main(String[] args) {
// Variáveis

        int x, y;
        
// Entrada de dados

        System.out.print("Digite a coordenada de X: ");
        x = Integer.valueOf(input.nextLine());
        
        System.out.print("Digite a coordenada de Y: ");
        y = Integer.valueOf(input.nextLine());
        
// Processamento de dados

        verificaQuadrante(x, y);
    }
    
    
    public static void verificaQuadrante (int x, int y){
        
        if (x >=1 && y >= 1) {
            System.out.println("A coordenada está no primeiro quadrante");
        } else if (x <=-1 && y >= 1) {
            System.out.println("A coordenada está no segundo quadrante");
        } else if (x >=1 && y <=-1){
            System.out.println("A coordenada está no terceiro quadrante");
        } else {
            System.out.println("A coordenada está no quarto quadrante");
        }
    }
}
