package java_fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChangeList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        List<Integer> numbers = readIntList(s);
        String input = s.nextLine();
        while (!"end".equals(input)) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            Integer element = Integer.valueOf(tokens[1]);//moje i s malkiq int a posle ni trqbva IInteger.valuerof();
            if ("Delete".equals(command)) {
                while (numbers.contains(element)) {
                    numbers.remove(element);
                }

            } else if ("Insert".equals(command)) {
                int position = Integer.parseInt(tokens[2]);
                if (position >= 0 && position < numbers.size()) {
                    numbers.add(position, element);
                }
            }
            input=s.nextLine();
        }
        printList(numbers);
    }

    private static void printList(List<Integer> list) {
        for (Integer element : list) {
            System.out.print(element + " ");
        }
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
