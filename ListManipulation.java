package java_fundamentals;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] parts = s.nextLine().split(" ");

        List<Integer> numbers = Arrays.stream(parts)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = s.nextLine();
        while (!command.equals("End")) {
            String[] commandParts = command.split(" ");
            String commandName = commandParts[0];
            int arg = Integer.parseInt(commandParts[1]);

            switch (commandName) {
                case "Add":
                    numbers.add(arg);
                    break;
                case "Remove":
                    numbers.remove(Integer.valueOf(arg));
                    break;
                case "RemoveAt":
                    numbers.remove(arg);
                    break;
                case "Insert":
                    int index = Integer.parseInt(commandParts[2]);
                    numbers.add(index, arg);
                    break;

            }
            command = s.nextLine();

        }
        System.out.println(numbers.toString().replaceAll("[\\[\\]]", ""));
    }
}
