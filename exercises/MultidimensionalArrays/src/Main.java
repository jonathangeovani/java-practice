public class Main {
    public static void main(String[] args) {

        String[][] cars = {
                {"Mustang", "Tesla", "Corolla"},
                {"4.0L", "469kW", "2.0L"},
                {"2007", "2018", "2015"}
        };

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + "\t");
            }
        }
    }
}