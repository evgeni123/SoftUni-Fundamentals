package java_fundamentals;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String numberAsString = s.nextLine();

        int totalSum = 0;

        for (int i = 0; i < numberAsString.length(); i++) {
            int digit = Integer.parseInt("" + numberAsString.charAt(i));
            int currentSum = 1;
            for (int j = 1; j <= digit; j++) {
                currentSum *= j;
            }
            totalSum += currentSum;
        }
        int number = Integer.parseInt(numberAsString);
        if (totalSum == number) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
