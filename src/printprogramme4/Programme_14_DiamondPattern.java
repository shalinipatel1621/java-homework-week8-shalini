package printprogramme4;
/**
 * Write a program in Java to display the pattern like a diamond using while loop
 */

import java.util.Scanner;

public class Programme_14_DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows for the diamond pattern: ");
        int rows = scanner.nextInt();
        printDiamond(rows);
        scanner.close();
    }

    public static void printDiamond(int rows) {
        int i = 1;
        int space = rows - 1;
        while (i <= rows) {
            int j = 1;
            while (j <= space) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            space--;
            i++;
        }
        i = rows - 1;
        space = 1;
        while (i >= 1) {
            int j = 1;

            while (j <= space) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            space++;
            i--;
        }
    }
}
