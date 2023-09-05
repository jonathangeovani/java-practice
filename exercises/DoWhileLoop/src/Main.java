import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;

        do {
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        } while (age < 5);

        System.out.println("You have more than 5 years old!");
    }
}