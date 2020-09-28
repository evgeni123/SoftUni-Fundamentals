package java_fundamentals;

import java.util.Scanner;

public class PrintandSum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int st=Integer.parseInt(s.nextLine());
        int en=Integer.parseInt(s.nextLine());
        int sum=0;
        for (int i = st; i <=en ; i++) {
            sum+=i;
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.printf("Sum: %d",sum);
    }
}
