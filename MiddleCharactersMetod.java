package java_fundamentals;

import java.util.Scanner;

public class MiddleCharactersMetod {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input = s.nextLine();

        printMiddleChar(input);
    }

    private static void printMiddleChar(String input) {
        if (input.length() % 2 == 0) {
            char firstSymbol = input.charAt(input.length() / 2 - 1);
            System.out.print(firstSymbol);
        }
        char secondSymbol = input.charAt(input.length() / 2);
        System.out.println(secondSymbol);
    }
}
