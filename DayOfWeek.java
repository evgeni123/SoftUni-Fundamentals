package java_fundamentals;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int dayNumber = Integer.parseInt(s.nextLine());

        String[] daysOfWeek={"Moncay", "Tuesday",
                "Wednesday", "Thursday",
                "Friday", "Saturday", "Sunday"};
        if(dayNumber>=1 && dayNumber<=7)
            System.out.println(daysOfWeek[dayNumber-1]);
        else System.out.println("Invalid day!");

    }
}
