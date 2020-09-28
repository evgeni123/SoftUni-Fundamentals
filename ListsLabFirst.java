package java_fundamentals;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListsLabFirst {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] parts = s.nextLine().split(" ");

        List<Double> numbers = new ArrayList<>();
        for (String part : parts) {
            double current = Double.parseDouble(part);

            numbers.add(current);

        }
        for (int i = 0; i < numbers.size() - 1; i++) {
            double current = numbers.get(i);
            double next = numbers.get(i + 1);

            if (current == next) {
                numbers.remove(i + 1);
                numbers.set(i, current + next);
                i=-1;
            }
        }
        for (Double number:numbers) {
            System.out.print(new DecimalFormat("0.#").format(number ) +" ");
        }
    }
}
