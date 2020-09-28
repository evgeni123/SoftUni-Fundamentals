package java_fundamentals;

import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        int age = Integer.parseInt(s.nextLine());
        double averageGrade = Double.parseDouble(s.nextLine());

        System.out.printf("Name: %s, Age: %d, Grade: %.2f", name, age, averageGrade);


    }
}
