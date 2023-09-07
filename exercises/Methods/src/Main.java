public class Main {
    public static void main(String[] args) {

        String name = "Bob Jones";
        int age = 3;

        sayHello(name, age);

        int x = 5;
        int y = 7;

        System.out.printf("%d + %d = %d", x, y, add(x,y));
    }

    static void sayHello(String name, int age) {
        System.out.printf("Hello %s!\n", name);
        System.out.printf("You are %d years old.\n", age);
    }

    static int add(int x, int y) {
        return x + y;
    }
}