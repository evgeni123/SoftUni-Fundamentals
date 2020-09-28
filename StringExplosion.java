package java_fundamentals;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        StringBuilder sb = new StringBuilder();
        int power = 0;

        for (int i = 0; i < input.length(); i++) {
            char currenChar = input.charAt(i);
            if (currenChar == '>') {
                power += Integer.parseInt(String.valueOf(input.charAt(i + 1)));
                sb.append('>');
            } else if (power == 0) {
                sb.append(currenChar);
            } else {
                power--;
            }
        }

        System.out.println(sb);

    }
}
