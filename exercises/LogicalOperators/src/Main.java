import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("You are playing a game! Press q or Q to quit.");
        System.out.println("If you are ok, type \"ok or \"OK to continue.");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        if (userInput.equals("q") || userInput.equals("Q")) {
            System.out.println("You quit the game!");
        } else if (!userInput.equals("ok") && !userInput.equals("OK")) {
            System.out.println("You are not ok to continue!");
        } else {
            System.out.println("You are ok to keep in the game.");
        }
    }
}