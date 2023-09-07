import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

        for(int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }

        scanner.nextLine();

        food.set(0, "arroz e feijão");
        food.remove(2);

        for(int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }

        food.clear();
        scanner.nextLine();

        System.out.println("Size of food after clear: " + food.size());
    }
}