package java_fundamentals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MidExamNumbers {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        List<Integer>numbers=readIntList(s);
        List<Integer>biggerNumbers=new ArrayList<>();
        double avrg=0;
        int sum=0;

        for (int i = 0; i < numbers.size(); i++) {
            int currentNumber=numbers.get(i);
            sum+=currentNumber;
        }
        avrg=1.0*(avrg+sum)/numbers.size();
        for (int i = 0; i < numbers.size(); i++) {
            int currentNumber=numbers.get(i);
            if(currentNumber>avrg){
                biggerNumbers.add(currentNumber);

            }
        }
        if(!biggerNumbers.isEmpty()){
            Collections.sort(biggerNumbers);
            Collections.reverse(biggerNumbers);
            while(biggerNumbers.size()>5){
                biggerNumbers.remove(biggerNumbers.size()-1);
            }
        }else{
            System.out.println("No");
        }
        for (int i = 0; i < biggerNumbers.size(); i++) {
            System.out.print(biggerNumbers.get(i)+" ");
        }

    }
    private static List<Integer> readIntList(Scanner scan) {
        List<Integer> list = new ArrayList<>();
        String[] input = scan.nextLine().split(" ");
        for (String s : input) {
            list.add(Integer.parseInt(s));
        }
        return list;
    }
}

