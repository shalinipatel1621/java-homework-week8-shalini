package printprogramme4;

/**
 * Shared Digit
 */
public class Programme_13_SharedDigit {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(14, 24));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(12, 34));
    }

    public static boolean hasSharedDigit(int a, int b) {
        if ((a < 10 || a > 99) || b < 10 || b > 99) {
            return false;
        }
        int firstDigit = a % 10;
        int secondDigit = a / 10;
        int firstDigit2 = b % 10;
        int secondDigit2 = b / 10;

        if (firstDigit == firstDigit2 || firstDigit == secondDigit2 || secondDigit == firstDigit2 || secondDigit == secondDigit2) {

            return true;
        } else {
            return false;

        }
    }
}
