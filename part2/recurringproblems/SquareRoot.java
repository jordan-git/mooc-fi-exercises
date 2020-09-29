package part2.recurringproblems;

import java.util.Scanner;

public class SquareRoot {
    public static void run(Scanner scanner) {
        System.out.print("Enter number one: ");
        int first = scanner.nextInt();
        System.out.print("Enter number two: ");
        int second = scanner.nextInt();

        double squareRoot = Math.sqrt(first + second);
        System.out.println("The square root of " + first + " and " + second + " is: " + squareRoot);
    }
}
