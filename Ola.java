import javax.swing.JOptionPane;

public class Ola{
    public static void main(String[] args) {
        String nome= JOptionPane.showInputDialog(null, "Diga o seu nome");
        JOptionPane.showMessageDialog(null, " Seu nome e:" + nome);
    }
}