package java_fundamentals;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, List<String>> companies = new LinkedHashMap<>();

        String input = sc.nextLine();
        while (!"End".equals(input)) {
            String[] tokens = input.split(" -> ");
            String company = tokens[0];
            String employe = tokens[1];

            companies.putIfAbsent(company, new LinkedList<>());
            List<String> list = companies.get(company);
            if (!list.contains(employe)) {
                list.add(employe);
            }

            input = sc.nextLine();
        }

        companies
                .entrySet()
                .stream()
                .sorted((c1, c2) -> c1.getKey().compareTo(c2.getKey()))
                .forEach(c -> {
                    System.out.println(c.getKey());
                    c.getValue().forEach((id -> System.out.println(String.format("-- %s", id))));
                });
    }
}
