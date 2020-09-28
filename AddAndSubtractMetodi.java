package java_fundamentals;

import java.util.Scanner;

public class AddAndSubtractMetodi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num1 = Integer.parseInt(s.nextLine());
        int num2 = Integer.parseInt(s.nextLine());
        int num3 = Integer.parseInt(s.nextLine());

        printSum(num1, num2, num3);

    }

    private static void printSum(int num1, int num2, int num3) {
        int sum = (num1 + num2) - num3;
        System.out.println(sum);
    }
}
