package java_fundamentals;

import java.util.Scanner;

public class CharacterMulti {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] input=s.nextLine().split("\\s+");
        String first = input[0];
        String second = input[1];

        int min = Math.min(first.length(), second.length());
        int max = Math.max(first.length(), second.length());

        int result = 0;

        for (int i = 0; i < max; i++) {
            if (i < min) {
                result += first.charAt(i) * second.charAt(i);
            } else if (first.length() == max) {
                result += first.charAt(i);
            } else {
                result += second.charAt(i);
            }
        }
        System.out.println(result);
    }
}
