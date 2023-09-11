public class Main {
    public static void main(String[] args) {

        // abstract =   abstract classes cannot be instantiated, but they can have a subclass
        //              abstract methods are declared without an implementation

        //Vehicle vehicle = new Vehicle();  -> Vehicle is too generic, so it is an abstract class, and we cannot instantiate it
        Car car = new Car();
    }
}