import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        //ler 4 números
        System.out.println("Digite 4 Números:");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 =sc.nextInt();
        int n4 =sc.nextInt();
        //quadrado de cada um 
        int n1quadrado= n1 * n1;
        int n2quadrado= (int) Math.pow(n2, 2);
        int n3quadrado= n3 * n3;
        int n4quadrado= n4 * n4;
        //somar os quadrados e mostrar o resultado
        int soma = n1quadrado + n2quadrado + n3quadrado + n4quadrado;
        System.out.println("o resultado é:" + soma);
        sc.close();
    }  
}
