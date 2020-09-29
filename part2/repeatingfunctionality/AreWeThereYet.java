package part2.repeatingfunctionality;

import java.util.Scanner;

public class AreWeThereYet {
    public static void run(Scanner scanner) {
        int input = 0;
        while (input != 4) {
            System.out.print("Give a number: ");
            input = scanner.nextInt();
        }
    }
}
