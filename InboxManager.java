package java_fundamentals;

import java.util.*;

public class InboxManager {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Map<String, List<String>> usersEmails = new LinkedHashMap<>();
        String input = s.nextLine();

        while (!input.equals("Statistics")) {
            String[] tokens = input.split("->");
            String command = tokens[0];
            String username = tokens[1];

            switch (command) {
                case "Add":
                    if (usersEmails.containsKey(username)) {
                        System.out.println(username + " is already registered");
                    } else {
                        usersEmails.putIfAbsent(username, new ArrayList<>());
                    }
                    break;
                case "Send":
                    String email = tokens[2];
                    List<String> currentEmails = usersEmails.get(username);
                    currentEmails.add(email);
                    break;
                case "Delete":
                    if (usersEmails.containsKey(username)) {
                        usersEmails.remove(username);
                    } else {
                        System.out.println(username + " not found!");
                    }
                    break;
            }

            input = s.nextLine();
        }

        System.out.println("Users count: " + usersEmails.size());
//descending

        usersEmails
                .entrySet()
                .stream()
                .sorted((a, b) -> {
                    int result = Integer.compare(b.getValue().size(), a.getValue().size());
                    if (result == 0) {
                        result = a.getKey().compareTo(b.getKey());
                    }
                    return result;
                }).forEach(entry -> {
            System.out.println(entry.getKey());
            for (String e : entry.getValue()) {
                System.out.println(" - " + e);
            }

        });

    }
}
