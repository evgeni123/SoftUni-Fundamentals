package java_fundamentals;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = Integer.parseInt(s.nextLine());
        int n = 1;
        while (n <= 10) {
            System.out.printf("%d X %d=%d%n", number, n, number * n);
            n++;
        }
    }
}
