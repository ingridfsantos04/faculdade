import java.util.Scanner;

public class Dolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ler a cotação do Dólar
        System.out.println(" Qual a cotação do Dólar?");
        double catacao = sc.nextDouble();
        //ler a quantidade de Dólares
        System.out.println("Quantos Dólares?");
        double Dolares = sc.nextDouble();
        //converter para real 
        double reais = Dolares *catacao;
        // mostrar o resultado
        System.out.printf("Você tem o equivalente a R$ %.2f\n", reais);
        sc.close();
    }

}
 