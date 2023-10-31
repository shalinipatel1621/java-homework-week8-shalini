package printprogramme4;
/**
 * WAP to input any number and check if it is Armstrong number or not
 */

import java.util.Scanner;

public class Programme_10_ArmstrongNumber {

    public static void armstrongNumber(int number) {
        int n = number;
        int count = 0;
        int a = n;
        int c = n;
        int sum = 0;
        while (a > 0) {
            a = a / 10;
            count++;
        }
        while (n > 0) {
            int b = n % 10;
            sum += Math.pow(b, count);
            n = n / 10;
        }
        if (sum == c) {
            System.out.println(c + " is an Armstrong number");
        } else {
            System.out.println(c + " is not an Armstrong number");
        }

    }
//main method declared
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = scanner.nextInt();
        armstrongNumber(number);

        //scanner closed
        scanner.close();
    }
}
