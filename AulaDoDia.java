    import java.util.Scanner;
    
public class AulaDoDia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o dia da semana (1-7): ");
        int dia = scanner.nextInt();
        
        switch (dia) {
            case 1:
                System.out.println("Segunda-feira: Matemática");
                break;
            case 2:
                System.out.println("Terça-feira: História");
                break;
            case 3:
                System.out.println("Quarta-feira: Ciências");
                break;
            case 4:
                System.out.println("Quinta-feira: Português");
                break;
            case 5:
                System.out.println("Sexta-feira: Educação Física");
                break;
            case 6:
                System.out.println("Sábado: Dia de descanso");
                break;
            case 7:
                System.out.println("Domingo: Dia de descanso");
                break;
            default:
                System.out.println("Dia inválido! Por favor, digite um número de 1 a 7.");
        }
    }
}

        












