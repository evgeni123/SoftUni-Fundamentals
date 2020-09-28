package java_fundamentals;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = Integer.parseInt(s.nextLine());
        String regex = "^U\\$(?<username>[A-Z][a-z]{2,})U\\$P@\\$(?<password>[A-Za-z]{5,}[0-9]+)P@\\$$";
        Pattern pattern = Pattern.compile(regex);
        int counter = 0;

        for (int i = 0; i < n; i++) {
            String input = s.nextLine();
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String username = matcher.group("username");
                String password = matcher.group("password");
                System.out.println("Registration was successful");
                System.out.println(String.format("Username: %s, Password: %s", username, password));

                counter++;
            } else {
                System.out.println("Invalid username or password");
            }
        }
        System.out.println("Successful registrations: "+ counter);

    }
}
