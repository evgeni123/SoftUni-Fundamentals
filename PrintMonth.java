package java_fundamentals;

import java.util.Scanner;

public class PrintMonth {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String country = s.nextLine();

        switch (country) {
            case "England":
            case "USA":
                System.out.println("English");
                break;
            case "Spain":
            case "Mexico":
            case "Argentina":
                System.out.println("Spanish");
            default:
                System.out.println("Error");
                break;
        }
    }
}
