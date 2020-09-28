package java_fundamentals;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String[] arr1=s.nextLine().split(" ");
        String[] arr2=s.nextLine().split(" ");

        for (String elementOne: arr2) {
            for (String elementTwo: arr1) {
                if(elementOne.equals(elementTwo)){
                    System.out.print(elementOne+" ");
                }

            }

        }

    }
}
