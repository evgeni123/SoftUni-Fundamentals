package java_fundamentals;

import java.util.Scanner;

public class Pokemon {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int startPokePower = Integer.parseInt(s.nextLine());
        int distance = Integer.parseInt(s.nextLine());
        int exhaustionFa = Integer.parseInt(s.nextLine());

        int currentPower = startPokePower;

        int targetsCount = 0;

        while (currentPower >= distance) {
            currentPower -= distance;
            targetsCount++;
            if ((currentPower == startPokePower / 2.0) && exhaustionFa != 0) {
                currentPower /= exhaustionFa;
            }
        }
        System.out.println(currentPower);
        System.out.println(targetsCount);
    }
}
