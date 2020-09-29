import java.util.Scanner;

import part2.recurringproblems.AbsoluteValue;
import part2.recurringproblems.ComparingNumbers;
import part2.recurringproblems.SquareRoot;
import part2.recurringproblems.Squared;
import part2.repeatingfunctionality.CarryOn;

public class App {
    public static void main(String[] args) {
        // Pass scanner to avoid error caused by constant opening/closing of scanner
        Scanner scanner = new Scanner(System.in);

        // Each class holds the exercise code in a static run method
        // Comment/uncomment to run specific parts

        // Part 2 - Recurring problems and patterns to solve them
        AbsoluteValue.run(scanner);
        ComparingNumbers.run(scanner);
        Squared.run(scanner);
        SquareRoot.run(scanner);

        // Part 2 - Repeating functionality
        CarryOn.run(scanner);

        scanner.close();
    }
}
