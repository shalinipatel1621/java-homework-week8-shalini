package printprogramme4;
/**
 * WAP in Java to display the pattern like a triangle with a number
 * for example
 * Input number of rows: 10
 * Expected output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */

import java.util.Scanner;

public class Programme_6_NumberTriangle {

    public static void numberTriangle(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the valid number: ");
        int number = scanner.nextInt();
        numberTriangle(number);
        scanner.close();
    }
}

