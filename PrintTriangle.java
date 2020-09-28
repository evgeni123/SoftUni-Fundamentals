package java_fundamentals;

import java.util.Scanner;

public class PrintTriangle {

    public static void printTriangle(int n) {
        printTopHalf(n);
        printLowerHalf(n-1);
    }

    private static void printTopHalf(int n) {
        for (int i = 1; i <= n; i++) {
            printRow(1, i);
            System.out.println();
        }
    }
    private static void printLowerHalf(int n) {
        for (int i = n; i >= 1; i--) {
            printRow(1, i);
            System.out.println();
        }
    }

    private static void printRow(int from, int to) {
        for (int i = from; i <= to; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());

        printTriangle(n);
    }
}
