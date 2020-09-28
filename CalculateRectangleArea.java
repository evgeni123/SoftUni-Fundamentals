package java_fundamentals;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int width = Integer.parseInt(s.nextLine());
        int heigth = Integer.parseInt(s.nextLine());

        int area = calculateArea(width, heigth);
    }

    private static int calculateArea(int a, int b) {
        return a * b;
    }
}
