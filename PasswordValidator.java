package java_fundamentals;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String password = s.nextLine();
        boolean isPasswordCorrect = isValidPassword(password);
        if (isPasswordCorrect) System.out.println("Password is valid");
    }

    private static boolean isValidPassword(String password) {
        boolean length = isLengthValid(password);
        boolean lettersDigits = onlyLettersDigits(password);
        boolean digitsCount = containEnoughDigits(password);
        boolean isValid = length && lettersDigits && digitsCount;
        return isValid;
    }

    private static boolean containEnoughDigits(String password) {
        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if (Character.isDigit(symbol))
                counter++;
            if (counter == 2) break;
        }
        if (counter == 2) return true;
        else System.out.println("Password must have at least 2 digits");
        return false;
    }

    private static boolean onlyLettersDigits(String password) {

        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if (!Character.isLetterOrDigit(symbol)) {
                System.out.println("Password must consist only of letters and digits");
                return false;
            }
        }
        return true;

    }

    private static boolean isLengthValid(String password) {

        if (password.length() >= 6 && password.length() <= 10)
            return true;
        else System.out.println("Password must be between 6 and 10 characters");


        return false;
    }

}
