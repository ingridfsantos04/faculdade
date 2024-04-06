import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a base do retângulo");
        double base = teclado.nextDouble();
        System.out.println("Digite a altura do retângulo: ");
        double altura = teclado.nextDouble();
        double area = base * altura;
        System.out.println("A Aréa do retângolo: " + area);
        teclado.close();

    
        }
}
