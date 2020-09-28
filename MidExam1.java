package java_fundamentals;

import java.util.Scanner;

public class MidExam1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int emp1=Integer.parseInt(s.nextLine());
        int emp2=Integer.parseInt(s.nextLine());
        int emp3=Integer.parseInt(s.nextLine());
        int studentsCount=Integer.parseInt(s.nextLine());
        int hours=0;

        while(studentsCount>0){
            studentsCount=studentsCount-(emp1+emp2+emp3);
            hours++;
            if(hours%4==0){
                hours++;
            }
        }
        System.out.printf("Time needed: %dh.",hours);
    }
}
