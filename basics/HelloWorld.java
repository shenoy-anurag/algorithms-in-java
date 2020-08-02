import java.util.*;
import java.util.stream.IntStream;

public class HelloWorld {

    // Scanner object that will read user input.
    static Scanner sc = new Scanner(System.in);

    // Constant value that cannot be modified post declaration and initialisation.
    final double shortPi = 3.14159;

    public static void main(String[] args) {
        // Print statement with a new line:
        System.out.println("Hello World\n");

        // Basic initialised variables:
        int numApples = 10;
        float costPerApple = 0.99f;
        float teslaStockPrice = 9000.01f;
        double pi = 3.14;
        double avogadroNumber = 6.02e23; // Avogadro's Number: 6.02 * 10^23 . Also showcases scientific notation.
        boolean everythingIsALie = true; // ponder over that one
        short height = 2;
        long numOfStarsInMilkyWay = 100_000_000_000_000L; // 100 Billion, underscores to make it readable.
        char x = 'x';

        // Uninitialised variables (only declared)
        int numOranges;
        float costPerOrange; // no wonder you cannot compare apples with oranges.
        double savingsBalance; // Non-existent hence no tesla stock.
        boolean chickenOrEgg;
        char ch;
        byte myByte;

        System.out.println("Maximum and minimum values that can be held by datatypes:");

        System.out.println("Byte Max: " + Byte.MAX_VALUE);
        System.out.println("Byte Min: " + Byte.MIN_VALUE);

        System.out.println("Short Max: " + Short.MAX_VALUE);
        System.out.println("Short Min: " + Short.MIN_VALUE);

        System.out.println("Char Max: " + Character.MAX_VALUE + 0);
        System.out.println("Char Min: " + Character.MIN_VALUE + 0);

        System.out.println("Int Max: " + Integer.MAX_VALUE);
        System.out.println("Int Min: " + Integer.MIN_VALUE);

        System.out.println("Long Max: " + Long.MAX_VALUE);
        System.out.println("Long Min: " + Long.MIN_VALUE);

        System.out.println("Float Max: " + Float.MAX_VALUE);
        System.out.println("Float Min: " + Float.MIN_VALUE);

        System.out.println("Double Max: " + Double.MAX_VALUE);
        System.out.println("Double Min: " + Double.MIN_VALUE);

        //
        int minNum = 1;
        int maxNum = 42;
        int randNum = minNum + (int)(Math.random() * (maxNum - minNum) + 1); // Type casting a double to int
        System.out.println("\nRandom Number: " + randNum);
    }
}
