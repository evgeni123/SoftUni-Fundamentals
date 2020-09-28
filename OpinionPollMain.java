package java_fundamentals;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OpinionPollMain {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=Integer.parseInt(s.nextLine());
        List<OpinionPollPerson>people=new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] tokens=s.nextLine().split("\\s+");
            String name=tokens[0];
            int age=Integer.parseInt(tokens[1]);
            OpinionPollPerson person=new OpinionPollPerson(name,age);
            if(person.getAge()>30){

                people.add(person);
            }
        }
        people.stream().sorted((p1,p2)->p1.getName().compareTo(p2.getName()))
                .forEach(p-> System.out.println(p.getName()+" - "+p.getAge()));

    }
}
