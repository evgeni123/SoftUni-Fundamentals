package java_fundamentals;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String username = s.nextLine();
        String password = "";
        for (int i = username.length() - 1; i >= 0; i--) {
            password += username.charAt(i);
        }
        boolean isLogged = false;
        for (int i = 0; i < 4; i++) {
            String input = s.nextLine();
            if (input.equals(password)) {
                isLogged = true;
                System.out.printf("User %s logged in.", username);
                break;
            }
            if (i < 3) {


                System.out.println("Incorrect password. Try again.");
            }
        }
        if (!isLogged) {
            System.out.printf("User %s blocked!", username);
        }
    }
}
