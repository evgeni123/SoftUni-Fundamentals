package java_fundamentals;

import java.util.*;

public class NikuldensMeals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Map<String, List<String>> likedMeals = new HashMap<>();
        int unlikedMeals = 0;
        while (!line.equals("Stop")) {
            String[] split = line.split("-");
            String type = split[0];
            String guestName = split[1];
            String mealName = split[2];

            if (type.equals("Like")) {
                likedMeals.putIfAbsent(guestName, new ArrayList<>());

                List<String> guestMeals = likedMeals.get(guestName);

                if (!guestMeals.contains(mealName)) {
                    guestMeals.add(mealName);
                }
                likedMeals.put(guestName, guestMeals);

            } else {
                if (!likedMeals.containsKey(guestName)) {
                    System.out.printf("%s is not at the party.%n", guestName);
                } else {
                    List<String> meals = likedMeals.get(guestName);

                    if (!meals.contains(mealName)) {
                        System.out.printf("%s doesn't have the %s in his/her collection.%n", guestName, mealName);
                    } else {
                        unlikedMeals++;
                        System.out.printf("%s doesn't like the %s.%n", guestName, mealName);
                        meals.remove(mealName);
                        likedMeals.put(guestName, meals);
                    }
                }
            }
            line = scanner.nextLine();

        }
//descending
        likedMeals
                .entrySet()
                .stream()
                .sorted((left, right) -> {
                    int res = right.getValue().size() - left.getValue().size();
                    if (res == 0) {
                        return left.getKey().compareTo(right.getKey());
                    } else {
                        return res;
                    }
                }).forEach(e -> System.out.println(e.getKey() + ": " + printList(e.getValue())));
        System.out.println("Unliked meals: " + unlikedMeals);
    }

    private static String printList(List<String> value) {
        return value.toString().replaceAll("[\\[\\]]", "");
    }
}
