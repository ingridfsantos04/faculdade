// escreve um programa que imprima os números de 1 a 20 substituindo os múltiplos de 4 ou de 10 por "PIM"
public class Pim {
    public static void main(String[] args) {
        for (int n = 1; n <= 20; n++ ) {
            
            if (n % 4 == 0 || n % 10 == 0 ){
            System.out.println ("PIM");
        } else{
            System.out.println(n);
         }  
       }
    }
}
