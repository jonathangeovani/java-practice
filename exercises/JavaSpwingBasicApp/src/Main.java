import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Hello there! What's your name?");
        JOptionPane.showMessageDialog(null, "Hi "+name+"! Nice to meet you!");

        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
        JOptionPane.showMessageDialog(null, "You are "+age+" years old!");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height (in cm)"));
        JOptionPane.showMessageDialog(null, "You are "+height+"cm tall.");
    }
}
