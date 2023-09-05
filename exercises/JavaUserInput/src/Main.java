import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Hi there! What's your name?");
        String name = read.nextLine();

        System.out.println("Hi " + name + "! How old are you?");
        int age = read.nextInt(); // it will get just the number, but will not add the '\n' at the end.
        read.nextLine(); // Just to clean the '\n' and continue properly.

        System.out.println("Awesome! You are " + age + " years old!");

    }
}
