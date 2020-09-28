package java_fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergingLists {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String firstInput = s.nextLine();
        String secondInput = s.nextLine();

        List<Integer> first = inputToList(firstInput);
        List<Integer> second = inputToList(secondInput);

        int minLength = Math.min(first.size(), second.size());
        for (int i = 0; i < minLength; i++) {
            System.out.print(first.get(i) + " ");
            System.out.print(second.get(i) + " ");
        }
        printAfterIndex(first, minLength);
        printAfterIndex(second, minLength);

    }

    private static void printAfterIndex(List<Integer> list, int start) {
        for (int i = start; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static List<Integer> inputToList(String input) {
        String[] parts = input.split(" ");

        List<Integer> result = new ArrayList<>();

        for (String part : parts) {
            int current = Integer.parseInt(part);

            result.add(current);
        }
        return result;
    }
}
