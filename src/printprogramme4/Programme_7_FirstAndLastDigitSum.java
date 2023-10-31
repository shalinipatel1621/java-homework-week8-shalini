package printprogramme4;
/**
 * First and last digit sum
 */

import java.util.Scanner;

public class Programme_7_FirstAndLastDigitSum {
    //method names sumFirstAndLastDigit with one parameter

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 0;
        } else {

            int lastDigit = number % 10;
            int firstDigit = 0;
            while ((number > 0)
            ) {

                firstDigit = number % 10;
                number /= 10;
            }
            return firstDigit + lastDigit;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = scanner.nextInt();
        int result = sumFirstAndLastDigit(number);
        if (result == 1) {
            System.out.println("Invalid input. Please enter a positive number: ");
        } else {
            System.out.println("The sum of the first and last digit is: " + result);
        }
        scanner.close();
    }
}
