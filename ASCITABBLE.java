package java_fundamentals;

import java.util.Scanner;

public class ASCITABBLE {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int start = Integer.parseInt(s.nextLine());
        int end = Integer.parseInt(s.nextLine());

        for (int i = start; i <= end; i++) {
            System.out.printf("%c ", i);

        }
    }
}
