package java_fundamentals;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char first = s.nextLine().charAt(0);
        char second = s.nextLine().charAt(0);

        if (first > second) printSymbolsInRange(second, first);
        else printSymbolsInRange(first, second);

    }

    public static void printSymbolsInRange(char a, char b) {
        for (char i = ++a; i < b; i++) {
            System.out.printf("%c ", i);

        }
    }
}
