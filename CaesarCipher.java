package java_fundamentals;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            sb.append((char)(symbol + 3));
        }
        System.out.println(sb.toString());
    }
}
