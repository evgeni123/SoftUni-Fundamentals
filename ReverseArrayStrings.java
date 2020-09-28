package java_fundamentals;

import java.util.Scanner;

public class ReverseArrayStrings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] parts = s.nextLine().split(" ");

        for (int i = 0; i < parts.length / 2; i++) {
            int swapIndex = parts.length - i - 1;
            String tmp = parts[i];
            parts[i] = parts[swapIndex];
            parts[swapIndex] = tmp;
        }
        System.out.println(String.join(" ",parts));
    }
}
