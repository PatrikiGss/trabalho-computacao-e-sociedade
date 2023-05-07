
package atv.lista.pkg3.pkg15.a.frente;

public class AtvLista315AFrente {
static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
    System.out.println("digite a idade so nadador");
    int idade =Integer.valueOf(input.nextLine());
   if(idade>=5||idade<=10){
     System.out.println("categoria infantil");}
   else if(idade>=11||idade<=17){
        System.out.println("categoria juvenil");}
   else if(idade>=18||idade<=60){
       System.out.println("categoria adulto");}
   else{
            System.out.println("senior");}
   }
   
      
      
    }
    

