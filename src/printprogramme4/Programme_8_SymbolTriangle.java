package printprogramme4;
/**
 * Display the right angle triangle of @ using nested for loops
 */

import java.util.Scanner;

public class Programme_8_SymbolTriangle {

    public static void numberTriangle(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
//main method declared
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the valid number: ");
        int number = scanner.nextInt();
        numberTriangle(number);
        scanner.close();
    }

}
