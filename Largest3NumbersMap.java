package java_fundamentals;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest3NumbersMap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String result=Arrays.stream(s.nextLine().split(" "))
                .map(n -> Integer.parseInt(n))
                .sorted((l, r) -> r.compareTo(l))
                .limit(3)
                .map(n->n.toString())
                .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}
