package java_fundamentals;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HousePartyList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        int n = Integer.parseInt(s.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = s.nextLine().split("\\s+", 2);
            String name = tokens[0];
            if ("is going!".equals(tokens[1])) {
                if (list.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    list.add(name);
                }

            } else if ("is not going!".equals(tokens[1])) {
                if (list.contains(name)) {
                    list.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }
        }
        for (String s1 : list) {
            System.out.println(s1);
        }
    }


}
