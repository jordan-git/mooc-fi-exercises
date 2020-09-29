package part2.recurringproblems;

import java.util.Scanner;

public class Squared {
    public static void run(Scanner scanner) {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println(number + " squared is equal to: " + number * number);
    }
}
