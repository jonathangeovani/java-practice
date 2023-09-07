public class Main {
    public static void main(String[] args) {

        // printf() =   an optional method to control, format and display text to the console window
        //              two arguments == format string + (object/variable/value)
        //              % [flags] [precision] [width] [conversion-character]

        boolean myBoolean = true;
        int myInt = 50;
        double myDouble = 1000;
        char myChar = '@';
        String myString = "Bob";

        // [conversion-character]
        System.out.printf("%b \n",myBoolean);
        System.out.printf("%d \n",myInt);
        System.out.printf("%f \n",myDouble);
        System.out.printf("%c \n",myChar);
        System.out.printf("%s \n",myString);

        // [width]
        // minimum number of characters to be written as output
        System.out.printf("\nHello %10s. \n", myString); // blank space before
        System.out.printf("Hello %-10s. \n", myString); // blank space after

        // [precision]
        // sets number of digits of precision when outputting float-point values
        System.out.printf("\n%.2f \n",myDouble);

        // [flags]
        // adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + : output a plus (+) or minus (-) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : dot (in Brazil and comma for US) grouping separator ir numbers > 1000
        System.out.printf("\n%,f",myDouble);
    }
}