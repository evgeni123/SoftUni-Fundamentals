package java_fundamentals;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sum=0;
        int a=Integer.parseInt(s.nextLine());
        int b=Integer.parseInt(s.nextLine());
        int c=Integer.parseInt(s.nextLine());
        int d=Integer.parseInt(s.nextLine());
        sum=((a+b)/c)*d;
        System.out.println(sum);
    }
}
