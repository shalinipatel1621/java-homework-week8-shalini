package printprogramme4;
/**
 * WAP to input any number and check if it is prime or not
 */

import java.util.Scanner;

public class Programme_12_PrimeNumber {

    public static boolean primeNumber(int n) {

        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        if (primeNumber(n)) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
        scanner.close();
    }


}

