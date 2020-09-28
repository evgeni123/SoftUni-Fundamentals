package java_fundamentals;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MidExamArrayModifier {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> numbers = readIntList(s);

        String command = s.nextLine();
        while (!command.equals("end")) {
            String[] tokens = command.split(" ");
            String currentCommand = tokens[0];
            switch (currentCommand) {
                case "swap":
                    int purviIndex = Integer.parseInt(tokens[1]);
                    int vtoriIndex = Integer.parseInt(tokens[2]);
                    int firstElement = numbers.get(purviIndex);
                    int secondElement = numbers.get(vtoriIndex);
                    numbers.set(purviIndex, secondElement);
                    numbers.set(vtoriIndex, firstElement);
                    break;
                case "multiply":
                    purviIndex = Integer.parseInt(tokens[1]);
                    vtoriIndex = Integer.parseInt(tokens[2]);
                    firstElement = numbers.get(purviIndex);
                    secondElement = numbers.get(vtoriIndex);
                    int modifiedValue = firstElement * secondElement;
                    numbers.set(purviIndex, modifiedValue);
                    break;
                case "decrease":
                    for (Integer num : numbers) {
                        int currentNumber = num;
                        int indexOfCurrNumber = numbers.indexOf(currentNumber);
                        numbers.set(indexOfCurrNumber, currentNumber-1);
                    }
                    break;
            }


            command = s.nextLine();
        }
        if(numbers.size()>=1){
            System.out.print(numbers.get(0));
        }
        for (int i = 1; i < numbers.size(); i++) {
            System.out.print(", "+ numbers.get(i));
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
