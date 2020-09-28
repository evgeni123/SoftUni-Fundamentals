package java_fundamentals;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = Integer.parseInt(s.nextLine());
        int b = Integer.parseInt(s.nextLine());
        int c = Integer.parseInt(s.nextLine());

        printSmallest(a, b, c);
    }

    private static void printSmallest(int a, int b, int c) {
        int smallest = a;
        if (a > b) smallest = b;
        if (b > c) smallest = c;
        System.out.println(smallest);
    }
}
