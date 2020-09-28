package java_fundamentals;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String regex = ">>(?<name>\\w+)<<(?<price>\\d+\\.?\\d*)!(?<quantity>\\d+)";
        Pattern pattern = Pattern.compile(regex);
        List<String> furniture = new LinkedList<>();
        double finalPrice = 0.0;

        String input = s.nextLine();
        while (!"Purchase".equals(input)) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String name = matcher.group("name");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                furniture.add(name);
                finalPrice += price * quantity;
            }
            input = s.nextLine();
        }
        System.out.println("Bought furniture:");
        furniture.forEach(e -> System.out.println(e));
        System.out.println(String.format("Total money spend: %.2f", finalPrice));

    }
}
