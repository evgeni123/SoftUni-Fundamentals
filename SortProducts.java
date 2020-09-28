package java_fundamentals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortProducts {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int count = Integer.parseInt(s.nextLine());

        List<String> products = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String current = s.nextLine();

            products.add(current);
        }
        Collections.sort(products);

        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + "." + products.get(i));
        }
    }
}
