package java_fundamentals;

import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
         String firstName=s.nextLine();
         String lastName=s.nextLine();
         String delimiter=s.nextLine();

        System.out.printf("%s%s%s",firstName,delimiter,lastName);

    }
}
