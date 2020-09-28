package java_fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOperation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> number = readIntList(s);

        String input = s.nextLine();
        while (!"End".equals(input)) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            switch (command) {
                case "Add":
                    int num = Integer.parseInt(tokens[1]);
                    number.add(num);
                    break;
                case "Insert":
                    num = Integer.parseInt(tokens[1]);
                    int index = Integer.parseInt(tokens[2]);
                    if (isValid(number, index)) {
                        number.add(index, num);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    index = Integer.parseInt(tokens[1]);
                    if (isValid(number, index)) {
                        number.remove(index);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    int count = Integer.parseInt(tokens[2]);
                    if ("left".equals(tokens[1])) {
                        for (int i = 0; i < count; i++) {
                            int temp = number.remove(0);
                            number.add(temp);

                        }

                    } else if ("right".equals(tokens[1])) {
                        for (int i = 0; i <count; i++) {
                            int temp = number.remove(number.size() - 1);
                            number.add(0, temp);
                        }
                    }
                    break;
            }
            input = s.nextLine();
        }
        printList(number);
    }

    private static boolean isValid(List<Integer> number, int index) {
        boolean result = index >= 0 && index < number.size();
        return result;
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
