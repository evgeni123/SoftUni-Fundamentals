package java_fundamentals;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] input = s.nextLine().split(" ");
        int n = Integer.parseInt(s.nextLine());
        for (int i = 0; i < n; i++) {
            String temp = input[0];
            for (int j = 0; j < input.length; j++) {
                input[j] = input[j + 1];
            }
            input[input.length - 1] = temp;
        }
        System.out.println(String.join(" ", input));
    }
}

