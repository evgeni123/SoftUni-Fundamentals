package java_fundamentals;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int count = Integer.parseInt(s.nextLine());

        for (int i = 1; i <= count; i++) {
            int digitSum = 0;
            int currentNum = i;
            while (currentNum > 0) {
                digitSum += currentNum % 10;
                currentNum /= 10;

            }
            boolean isSpecial = (digitSum == 5) ||
                    (digitSum == 7) ||
                    (digitSum == 11);
            System.out.println(i + "-> " + isSpecial);
        }
    }
}
