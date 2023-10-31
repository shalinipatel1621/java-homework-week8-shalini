package printprogramme4;
/**
 * Read 10 numbers from the console entered by the user and print the sum of these numbers
 */

import java.util.Scanner;

public class Programme_1_ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (count < 10) {
            //Prompt the user to enter a number
            System.out.println("Enter number #" + (count + 1) + ": ");
            if (hasNextInt(scanner)) {
                int number = nextInt(scanner);
                sum += number;
                count++;
            } else {
                System.out.println("Invalid Number ");
                scanner.next();
            }
        }
        scanner.close();
        System.out.println("Sum of the entered numbers: " + sum);
    }

    public static boolean hasNextInt(Scanner scanner) {
        return scanner.hasNextInt();
    }

    public static int nextInt(Scanner scanner) {
        return scanner.nextInt();
    }
}





