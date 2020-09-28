package java_fundamentals;

import java.util.Scanner;

public class digitsLetterAndOther {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input = s.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder others = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (Character.isAlphabetic(current)) {
                letters.append(current);
            } else if (Character.isDigit(current)) {
                digits.append(current);
            } else {
                others.append(current);
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(others);

    }
}
