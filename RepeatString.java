package java_fundamentals;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        String[] words=s.nextLine().split(" ");

        String result="";
        for (int i = 0; i < words.length; i++) {
            result+=repeatTimes(words[i],words[i].length());
        }
        System.out.println(result);
    }

    private static String repeatTimes(String word, int length) {
        String result="";

        for (int i = 0; i < length; i++) {
            result+=word;
        }
        return result;
    }
}
