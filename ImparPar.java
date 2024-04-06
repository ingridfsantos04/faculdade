import javax.swing.JOptionPane;

public class ImparPar {
    public static void main(String[] args) {
            String auxiliar= JOptionPane.showInputDialog(null,"Digite um numero inteiro");
            int numero= Integer.parseInt(auxiliar);
            int resto= numero % 2;
        if ( resto == 0){
            JOptionPane.showMessageDialog(null, numero + " e par");
        }
        else { JOptionPane.showMessageDialog(null, numero + " e impar");}
       
    }
}
