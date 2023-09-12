import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red \nViolets are blue \nLet me try an other thing \nThan this poem do \n");
            writer.append("(A random poem)");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}