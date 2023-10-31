package printprogramme4;
/**
 * Even digit sum
 */

import java.util.Scanner;

public class Programme_11_EvenDigitSum {
    //write a method named getEvenDigitSum with one parameter

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        int evenSum = getEvenDigitSum(number);
        if (evenSum == -1) {
            System.out.println("Invalid Value: ");
        } else {

            System.out.println("Sum of even digits: " + evenSum);
        }
    }
}
