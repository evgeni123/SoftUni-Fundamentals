package java_fundamentals;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String digitRegex = "\\d";
        String letterRegex = "[A-Za-z]";

        Pattern digitPattern = Pattern.compile(digitRegex);
        Pattern letterPattern = Pattern.compile(letterRegex);

        List<String> participants = new ArrayList<>();
        String[] input = s.nextLine().split(", ");
        for (String s1 : input) {
            participants.add(s1);
        }
        //List<String>participants= Arrays.stream(s.nextLine().split(", ")).collect(Collectors.toList());
        Map<String, Integer> race = new LinkedHashMap<>();
        String inputLine = s.nextLine();
        while (!"end of race".equals(inputLine)) {
            StringBuilder sb = new StringBuilder();
            Matcher letterMatcher = letterPattern.matcher(inputLine);
            while (letterMatcher.find()) {
                sb.append(letterMatcher.group());

            }

            if (participants.contains(sb.toString())) {
                race.putIfAbsent(sb.toString(), 0);
                int km = race.get(sb.toString());

                Matcher digitMatcher = digitPattern.matcher(inputLine);
                while (digitMatcher.find()) {
                    km += Integer.parseInt(digitMatcher.group());
                }
                race.put(sb.toString(), km);
            }
            inputLine = s.nextLine();
        }
        List<String> output=new ArrayList<>();
        output.add("1st place: ");
        output.add("2nd place: ");
        output.add("3rd place: ");


        race
                .entrySet()
                .stream()
                .sorted((r1,r2)->r2.getValue().compareTo(r1.getValue()))
                .limit(3)
                .forEach(r->{
                    System.out.println(output.remove(0)+r.getKey());
                });
    }
}
