package java_fundamentals;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int person=Integer.parseInt(s.nextLine());
        int capacity=Integer.parseInt(s.nextLine());

        int count=person/capacity;

        if(count*capacity<person){
            count++;
        }
        System.out.println(count);


    }
}
