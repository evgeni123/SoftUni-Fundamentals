package java_fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] input = s.nextLine().split("\\|");
        List<String> result = new ArrayList<>();

        for (int i = input.length - 1; i >= 0; i--) {
            String[] temp = input[i].split("\\s+");
            for (String s1 : temp) {
                if(!"".equals(s1))
                result.add(s1);
            }

        }
        System.out.println(String.join(" ", result));
    }
}
