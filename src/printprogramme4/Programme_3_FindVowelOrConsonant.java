package printprogramme4;
/**
 * WAP that takes the user to provide a single character from the alphabet. Print vowel consonant depending on the user
 * input. If the user input is not a letter or a string of length >! print an error message
 */

import java.util.Scanner;

public class Programme_3_FindVowelOrConsonant {
    //static method
    public static void vowelAndConsonant(String input) {
        if (input.length() == 1) {
            char ch = input.charAt(0);
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                ch = Character.toUpperCase(ch);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println("Input letter is Vowel");

                }
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    System.out.println("Input letter is Vowel");
                } else {
                    System.out.println("Input letter is Consonant");
                }
            } else {
                System.out.println("Input not a letter");

            }
        } else {

            System.out.println("Invalid input");
        }

    }
    //main method declared

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an alphabet: ");
        String input = scanner.next();
        vowelAndConsonant(input);
//scanner closed
        scanner.close();
    }
}
