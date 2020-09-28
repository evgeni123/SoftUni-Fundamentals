package java_fundamentals;

import java.util.Scanner;

public class NikuldensCharity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encrypted = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Finish")) {
            String[] commandParts = command.split(" ");
            String commandName = commandParts[0];

            switch (commandName) {
                case "Replace":
                    encrypted = replace(encrypted, commandParts[1].charAt(0), commandParts[2].charAt(0));
                    break;
                case "Cut":
                    int beginIndex = Integer.parseInt(commandParts[1]);
                    int endIndex = Integer.parseInt(commandParts[2]);
                    encrypted = cut(encrypted, beginIndex, endIndex);
                    break;
                case "Make":
                    encrypted = make(encrypted, commandParts[1]);
                    break;
                case "Check":
                    check(encrypted, commandParts[1]);
                    break;
                case "Sum":
                    int beginSumIndex = Integer.parseInt(commandParts[1]);
                    int endSumIndex = Integer.parseInt(commandParts[2]);
                    sum(encrypted, beginSumIndex, endSumIndex);
                    break;
            }

            command = scanner.nextLine();
        }

    }

    private static void sum(String encrypted, int beginSumIndex, int endSumIndex) {
        if (areValidIndexes(encrypted.length(), beginSumIndex, endSumIndex)) {
            int sum = 0;
            for (int i = beginSumIndex; i <= endSumIndex; i++) {
                sum += encrypted.charAt(i);
            }
            System.out.println(sum);
        }
    }

    private static void check(String encrypted, String searchFor) {
        if (encrypted.contains(searchFor)) {
            System.out.println("Message contains " + searchFor);
        } else {
            System.out.println("Message doesn't contain " + searchFor);
        }
    }

    private static String make(String encrypted, String targetCase) {
        if (targetCase.equals("Upper")) {
            encrypted = encrypted.toUpperCase();
        } else {
            encrypted = encrypted.toLowerCase();
        }
        System.out.println(encrypted);
        return encrypted;
    }

    private static String cut(String encrypted, int beginIndex, int endIndex) {
        int length = encrypted.length();
        if (areValidIndexes(length, beginIndex, endIndex)) {
            String firstPart = encrypted.substring(0, beginIndex);
            String lastPart = encrypted.substring(endIndex + 1);
            System.out.println(firstPart + lastPart);
            return firstPart + lastPart;
        }
        return encrypted;
    }

    private static boolean areValidIndexes(int length, int beginIndex, int endIndex) {
        if (beginIndex >= 0 && beginIndex < length && endIndex >= 0 && endIndex < length) {
            return true;
        } else {
            System.out.println("Invalid indexes!");
            return false;
        }
    }

    private static String replace(String encrypted, char searchFor, char replaceWith) {
        encrypted = encrypted.replace(searchFor, replaceWith);
        System.out.println(encrypted);
        return encrypted;
    }
}
