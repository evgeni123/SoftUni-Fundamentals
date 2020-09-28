package java_fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderByAgeMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<OrderByAgePerson> people = new ArrayList<>();

        String input = s.nextLine();
        while (!"End".equals(input)) {
            String[] tokens = input.split("\\s+");
            String name = tokens[0];
            String id = tokens[1];
            int age = Integer.parseInt(tokens[2]);

            OrderByAgePerson person = new OrderByAgePerson(name, id, age);
            people.add(person);
            input = s.nextLine();
        }
        people.stream()
                .sorted((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()))
                .forEach(p -> System.out.println(p));
    }
}
