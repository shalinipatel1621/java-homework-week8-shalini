package printprogramme4;
/**
 * digit sum challenge
 */

import java.util.Scanner;

public class Programme_4_DigitSumChallenge {
    //create a static method
    public static int sumDigits(int number) {
        if (number >= 10) {//if condition
            int sum = 0;

            while (number > 0) {
                int digit = number % 10;
                sum = sum + digit;
                number = number / 10;
            }
            return sum;
        } else {
            return -1;
        }
    }
//main method declared
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a valid number: ");
        int number = scanner.nextInt();
        int result = sumDigits(number);
        System.out.println("Result is: " + result);
        //scanner closed
        scanner.close();
    }
}
