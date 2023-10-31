package printprogramme4;
/**
 * Palindrome number
 *
 */

import java.util.Scanner;

public class Programme_5_PalindromeNumber {

    public static boolean isPalindrome(int number) {//static method declared
        int originalNumber = number;
        int reverseNumber = 0;
        while (number > 0) {
            int digit = number % 10;
            reverseNumber = reverseNumber * 10 + digit;
            number = number / 10;
        }
        if (originalNumber == reverseNumber) {
            return true;
        } else {
            return false;
        }
    }
    //main method declared

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        boolean result = isPalindrome(number);
        System.out.println(result);
        //closure of scanner
        scanner.close();
    }
}
