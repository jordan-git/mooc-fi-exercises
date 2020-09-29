package part2.recurringproblems;

import java.util.Scanner;

public class ComparingNumbers {
    public static void run(Scanner scanner) {
        String comparison; // In a real project I would try better to name this.

        System.out.print("Enter first number: ");
        int first = scanner.nextInt();

        System.out.print("Enter second number: ");
        int second = scanner.nextInt();

        if (first < second)
            comparison = " is less than ";
        else if (first > second)
            comparison = " is greater than ";
        else
            comparison = " is equal to ";

        System.out.println(first + comparison + second + ".");
    }
}
