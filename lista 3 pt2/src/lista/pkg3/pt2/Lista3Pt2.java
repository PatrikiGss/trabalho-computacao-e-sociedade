
package lista.pkg3.pt2;

import java.util.Scanner;


public class Lista3Pt2 {
static Scanner sc = new Scanner(System.in);
    // atv 7
    public static void main(String[] args) {
      
System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = sc.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num1 > num3) {
            int temp = num1;
            num1 = num3;
            num3 = temp;
        }

        if (num2 > num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }

        System.out.println("Os números em ordem crescente são: " + num1 + ", " + num2 + ", " + num3);
        
       
            
            
            

        }
        
        
                    
                
                        
          
        
    }
