package java_fundamentals;

import java.util.Scanner;

public class FactorialDivisionMEt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double num1 = s.nextDouble();
        double num2 = s.nextDouble();

        printFacSum(num1, num2);
    }

    private static void printFacSum(double num1, double num2) {
        double sum = 0;
        double firstFac = findFactoriel(num1);
        double secondFac = findFactoriel(num2);
        sum = firstFac / secondFac;
        System.out.printf("%.2f", sum);
    }

    private static double findFactoriel(double num1) {
        double fac = 1;
        for (double i = num1; i > 0; i--) {
            fac *= i;

        }
        return fac;
    }
}
