package java_fundamentals;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double IvanChoMoney = Double.parseDouble(s.nextLine());
        int padawanCnt = Integer.parseInt(s.nextLine());
        double lightsaberSinglePrice = Double.parseDouble(s.nextLine());
        double robeSinglePrice = Double.parseDouble(s.nextLine());
        double beltSinglePrice = Double.parseDouble(s.nextLine());

        double lightsabersTotalPrice = Math.ceil(padawanCnt * 1.1);
        double robesTotalPrice = padawanCnt * robeSinglePrice;
        int freeBeltCnt = padawanCnt / 6;
        double beltsTotalPrice = (padawanCnt - freeBeltCnt) * beltSinglePrice;

        double finalPrice = lightsabersTotalPrice + robesTotalPrice + beltsTotalPrice;

        if (finalPrice > IvanChoMoney) {
            double moneyNeed = finalPrice - IvanChoMoney;
            System.out.printf("Ivan Cho will need %.2flv more.", moneyNeed);
        } else {
            System.out.printf("The money is enough - it would cost %.2flv.", finalPrice);

        }
    }
}
