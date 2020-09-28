package java_fundamentals;

import java.util.Random;
import java.util.Scanner;

public class RandomStringsObjects {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] word = s.nextLine().split(" ");

        Random rand = new Random();
        for (int i = 0; i < word.length; i++) {
            int randomIndex = 0;

            rand.nextInt(word.length);
            String temp = word[i];
            word[i] = word[randomIndex];
            word[randomIndex] = temp;
        }
        for (String s1 : word) {
            System.out.println(s1);
        }
    }
}
