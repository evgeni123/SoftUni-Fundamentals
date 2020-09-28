package java_fundamentals;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Map<String, List<Double>> students = new LinkedHashMap<>();

        int n = Integer.parseInt(s.nextLine());
        for (int i = 0; i < n; i++) {
            String studentName = s.nextLine();
            double grade = Double.parseDouble(s.nextLine());

            students.putIfAbsent(studentName, new ArrayList<>());
            students.get(studentName).add(grade);
        }
        students
                .entrySet()
                .stream()
                .filter(s1 -> s1.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble() >= 4.50)
                .sorted((s2, s3) -> {
                    double first = s2.getValue().stream().mapToDouble(Double::doubleValue).average().orElse(0);
                    double second = s3.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
                    return Double.compare(second, first);
                })
                .forEach(s1 -> System.out.println(String.format("%s -> %.2f", s1.getKey(), s1.getValue()
                        .stream()
                        .mapToDouble(Double::doubleValue)
                        .average().getAsDouble())));
    }
}
