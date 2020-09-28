package java_fundamentals;

import java.util.Scanner;

public class MaxSequenceOfEqualEl {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] input = s.nextLine().split(" ");
        int[] numbers = new int[input.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        int currentLength = 1;
        int digit = 0;
        int bestLength = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            int currentEl = numbers[i];
            int next = numbers[i + 1];
            if (currentEl == next) {
                currentLength++;
                if (currentLength > bestLength) {
                    bestLength = currentLength;
                    digit = currentEl;
                }
            } else {
                currentLength = 1;
            }
        }
        for (int i = 0; i < bestLength; i++) {
            System.out.print(digit + " ");
        }
    }
}
