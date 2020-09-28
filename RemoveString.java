package java_fundamentals;

import java.util.Scanner;

public class RemoveString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String token = s.nextLine();
        String input = s.nextLine();

        int indexOfToken = input.indexOf(token);
        while (indexOfToken >= 0) {
            input = input.substring(0, indexOfToken) +
                    input.substring(indexOfToken + token.length());

            indexOfToken = input.indexOf(token);
        }
        System.out.println(input);
    }
}
