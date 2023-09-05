public class Main {
    public static void main(String[] args) {

        // Array first method;
        String[] cars = {"Mustang", "Corolla", "Tesla"};
        int[] years = {2007, 2015, 2018};

        for (int i = 0; i < cars.length; i++) {
            System.out.println("There is a " + years[i] + " " + cars[i]);
        }
        System.out.println();

        // Array second method;
        String[] dogs = new String[3];

        dogs[0] = "Fred";
        dogs[1] = "Bob";
        dogs[2] = "Bill";

        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i]);
        }
    }
}