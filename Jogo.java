public class Jogo {
    public static void main(String[] args) {
        Personagem  cacador = new Personagem ("John", 0, 0,0);
            while (true) {
                cacador.cacar();
                cacador.comer();
                cacador.dormir();
                cacador.cacar();
                cacador.cacar();
                cacador.cacar();
                cacador.cacar("zzzzzzzzzzzzzzzzzz");

            }
    }
    
}
