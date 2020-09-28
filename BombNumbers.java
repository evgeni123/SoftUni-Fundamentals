package java_fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        List<Integer> numbers=readIntList(s);
        int[] bombinfo= Arrays.stream(s.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();//sukraten variant za chetene na masiv
        int bomb=bombinfo[0];
        int power=bombinfo[1];

        while(numbers.contains(bomb)){
            int index=numbers.indexOf(bomb);

            int leftBound=Math.max(index-power,0);
            int rightBound=Math.min(index+power,numbers.size()-1);
            for (int i = rightBound; i >=leftBound ; i--) {
                numbers.remove(i);
            }
        }

        int sum=sumList(numbers);
        System.out.println(sum);

    }

    private static int sumList(List<Integer> numbers) {
        int result=0;
        for (Integer number : numbers) {
            result+=number;
        }
        return result;
    }

    private static List<Integer> readIntList(Scanner scan) {
        List<Integer> list = new ArrayList<>();
        String[] input = scan.nextLine().split("\\s++");
        for (String s : input) {
            list.add(Integer.parseInt(s));
        }
        return list;
    }


}

