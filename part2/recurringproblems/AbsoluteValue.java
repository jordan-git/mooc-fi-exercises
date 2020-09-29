package part2.recurringproblems;

import java.util.Scanner;

public class AbsoluteValue {
    public static void run(Scanner scanner) {

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number < 0)
            number = number * -1;

        System.out.println("Absolute value: " + number);
    }
}
