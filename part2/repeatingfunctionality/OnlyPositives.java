package part2.repeatingfunctionality;

import java.util.Scanner;

public class OnlyPositives {
    public static void run(Scanner scanner) {
        int number;
        while (true) {
            System.out.print("Give a number: ");
            number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Unsuitable number");
                continue;
            } else if (number == 0) {
                break;
            } else {
                System.out.println(number * number);
                break;
            }
        }
    }
}
