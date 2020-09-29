package part2.repeatingfunctionality;

import java.util.Scanner;

public class CarryOn {
    public static void run(Scanner scanner) {
        boolean shouldCarryOn = true;

        while (shouldCarryOn) {
            System.out.print("Shall we carry on?: ");
            String input = scanner.nextLine();

            if (input.equals("no"))
                shouldCarryOn = false;
        }
    }
}
