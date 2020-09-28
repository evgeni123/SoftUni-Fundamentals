package java_fundamentals;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Map<String, List<String>> course = new LinkedHashMap<>();

        String input = s.nextLine();
        while (!"end".equals(input)) {
            String[] tokens = input.split(" : ");
            String courseName = tokens[0];
            String studentName = tokens[1];

            course.putIfAbsent(courseName, new ArrayList<>());
           // List<String> students = course.get(courseName);
            //students.add(studentName);
            course.get(courseName).add(studentName);

            input = s.nextLine();
        }
        course
                .entrySet()
                .stream()
                .sorted((c1, c2) -> Integer.compare(c2.getValue().size(), c1.getValue().size()))
                .forEach(entry -> {
                    System.out.println(String.format("%s: %d", entry.getKey(), entry.getValue().size()));
                    entry
                            .getValue()
                            .stream()
                            .sorted((s1, s2) -> s1.compareTo(s2))
                            .forEach(s3 -> System.out.println(String.format("-- %s", s3)));
                });

    }
}
