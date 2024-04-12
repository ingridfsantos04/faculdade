import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        int[] n = new int[5];        
            Scanner leitor = new Scanner(System.in);
              for (int i = 0; i < n.length; i++) {
                System.out.println("digite a nota " + i + " da biblioteca: ");
                int valor = leitor.nextInt();
                notas[i] = valor;
              }

              int total = 0;
              for (int i = 0; i < notas.length; i++) {
                total += notas[i];
              }
              System.out.println("A média é: " + total / (double) notas.length);
              leitor.close();
     }       
 }

