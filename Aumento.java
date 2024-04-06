public class Aumento {
    public static void main(String[] args) {
        double salario = 1000;
        double porcentagemAumento = 1.5;
        double aumento;
        for (int ano = 2006; ano <= 2024; ano++){
            aumento = salario  * (porcentagemAumento/ 100);
            salario += aumento;
            System.out.println( " Ano: " + ano + " % aumento: " + porcentagemAumento + " aumento: " + aumento + " salário: " + salario);
            porcentagemAumento *= 2;
        }
    }
    
}
