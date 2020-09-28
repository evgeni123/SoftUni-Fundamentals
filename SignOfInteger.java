package java_fundamentals;

import java.util.Scanner;

public class SignOfInteger {
    public static void printSign(int number){
        if(number>0){
            System.out.printf("The number %d is positive.",number);
        }else if(number<0){
            System.out.printf("The number %d is negative.",number);
        }else{
            System.out.printf("The number %d is zero.",number);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num = Integer.parseInt(s.nextLine());

        printSign(num);
    }
}
