public class Main {
    public static void main(String[] args) {

        String name = "  Bob Jones   ";

        // Methods;
        boolean equals = name.equalsIgnoreCase("  bob jones   ");
        int lenght = name.length();
        char character = name.charAt(0);
        int index = name.indexOf("e");
        boolean empty = name.isEmpty();
        String lower = name.toLowerCase();
        String upper = name.toUpperCase();
        String trim = name.trim();
        String replaced = name.replace("Jones", "Junior");
        boolean contains = name.contains("one");

        System.out.println("Equals: " + equals);
        System.out.println("Lenght: " + lenght);
        System.out.println("Character: " + character);
        System.out.println("Index: " + index);
        System.out.println("Empty: " + empty);
        System.out.println("Lower: " + lower);
        System.out.println("Upper: " + upper);
        System.out.println("Trim: " + trim);
        System.out.println("Replaced: " + replaced);
        System.out.println("Contains: " + contains);
    }
}