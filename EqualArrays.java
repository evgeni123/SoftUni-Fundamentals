package java_fundamentals;

import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] first = s.nextLine().split(" ");
        String[] second = s.nextLine().split(" ");

        int sum = 0;
        for (int i = 0; i < first.length; i++) {
            if (first[i].equals(second[i])) {
                System.out.printf("Arrays are not identical.%n" +
                        "Found difference at %d index.%n", i);
                return;
            }
            sum += Integer.parseInt(first[i]);
        }
        System.out.printf("Arrays are identical. Sum: %d%n", sum);
    }
}
