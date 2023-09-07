public class Car {
    String make = "Chevrolet";
    String model = "Corvette";
    int year = 2020;
    String color = "White";
    double price = 150000.00;

    void drive() {
        System.out.printf("You drive the %s. \n", model);
    }
    void brake() {
        System.out.println("You step on the brakes.");
    }
}
