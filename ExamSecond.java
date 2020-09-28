package java_fundamentals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExamSecond {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String regex="([=\\/])([A-Z][A-z]{2,})\\1";
        Pattern pattern= Pattern.compile(regex);
        int countera=0;


        String inputLoc=s.nextLine();
        Matcher matcher=pattern.matcher(inputLoc);
        List<String> aideMesta=new ArrayList<>();
        while(matcher.find()){
            countera+=matcher.group(2).length();
            aideMesta.add(matcher.group(2));

        }
        System.out.printf("Destinations: %s%n",String.join(", ",aideMesta));


        System.out.println("Travel Points: "+countera);
    }
}
