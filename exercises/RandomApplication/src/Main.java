import java.util.Random;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(10) + 1;
        JOptionPane.showMessageDialog(null, "Irei escolher um número de 1 a 10. Tente advinhar qual é.");
        int userNumber = Integer.parseInt(JOptionPane.showInputDialog("Qual número acha que escolhi?"));
        if (userNumber == number) {
            JOptionPane.showMessageDialog(null, "Você acertou! Eu escolhi o número " + number);
        } else {
            JOptionPane.showMessageDialog(null, "Você errou. Eu escolhi o número " + number);
        }
    }
}
