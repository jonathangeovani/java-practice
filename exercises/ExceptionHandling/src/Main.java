import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {

        // exception =  an event that occurs during the execution of a program that,
        //              disrupts the normal flow of instructions

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x/y;

            System.out.printf("Result: %d", z);

        } catch(ArithmeticException e) {
            System.out.println("You can't divide by zero!");
        } catch (InputMismatchException e) {
            System.out.println("Need to enter a integer number!");
        } catch(Exception e) {
            System.out.println("Something went wrong! " + e);
        } finally {
            scanner.close();
        }
    }
}