package java_fundamentals;

import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        char first = s.nextLine().charAt(0);
        char seocnd = s.nextLine().charAt(0);
        char third = s.nextLine().charAt(0);

        System.out.printf("%c %c %c", third, seocnd, first);
    }
}
