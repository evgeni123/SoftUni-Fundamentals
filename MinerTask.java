package java_fundamentals;

        import java.util.HashMap;
        import java.util.LinkedHashMap;
        import java.util.Map;
        import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Map<String, Integer> items = new LinkedHashMap<>();

        String item = s.nextLine();
        while (!item.equals("stop")) {
            int count = Integer.parseInt(s.nextLine());
            items.putIfAbsent(item, 0);
            int newCount = items.get(item) + count;
            items.put(item, newCount);


            item = s.nextLine();

        }
        items.forEach((k, v) -> System.out.println(String.format("%s -> %d", k, v)));
    }
}
