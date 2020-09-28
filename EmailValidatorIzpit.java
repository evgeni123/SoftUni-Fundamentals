package java_fundamentals;

import java.util.Scanner;

public class EmailValidatorIzpit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String email = s.nextLine();
        String input = s.nextLine();

        while (!input.equals("Complete")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "Make":
                    String makeType = tokens[1];
                    if (makeType.equals("Upper")) {
                        email = email.toUpperCase();
                    } else {
                        email = email.toLowerCase();
                    }
                    System.out.println(email);
                    break;
                case "GetDomain":
                    int count = Integer.parseInt(tokens[1]);
                    int indexDomain = email.length() - count;
                    String domain = email.substring(indexDomain);
                    System.out.println(domain);
                    break;
                case "GetUsername":
                    if (email.contains("@")) {
                        int indexOfMaimunka = email.indexOf('@');
                        String username = email.substring(0, indexOfMaimunka);
                        System.out.println(username);
                    } else {
                        System.out.println(String.format("The email %s doesn't contain the @ symbol.", email));
                    }
                    break;
                case "Replace":
                    String ch = tokens[1];
                    email = email.replace(ch, "-");
                    System.out.println(email);
                    break;
                case "Encrypt":
                    for (int i = 0; i < email.length(); i++) {
                        char currentChar = email.charAt(i);
                        System.out.print((int) currentChar + " ");
                    }
                    System.out.println();
                    break;
            }

            input = s.nextLine();
        }
    }
}
