package part2.repeatingfunctionality;

import java.util.Scanner;

public class NumberOfNumbers {
    public static void run(Scanner scanner) {
        int sum = 0;
        while (true) {
            System.out.print("Give a number: ");
            int input = scanner.nextInt();

            sum += 1;
            if (input == 0)
                break;

        }

        System.out.println("Number of numbers: " + sum);
    }
}
