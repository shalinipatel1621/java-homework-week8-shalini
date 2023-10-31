package printprogramme4;
/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

import java.util.Scanner;

public class Programme_9_FibonacciNumber {
    public static void fibonacci(int number) {
        int first = 1;
        int second = 1;
        System.out.print(first + " " + second);
        for (int i = 3; i <= number; i++) {
            int third = first + second;
            System.out.print(" " + third);
            first = second;
            second = third;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        fibonacci(number);
        scanner.close();
    }
}
