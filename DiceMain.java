package java_fundamentals;

public class DiceMain {
    public static void main(String[] args) {

        Dice dice=new Dice(20);
        Dice d2=new Dice(10);

        System.out.println(dice.getSides());
        dice.setSides(20);
        d2.setSides(10);

        System.out.println(dice.roll());
        System.out.println(d2.roll());
    }
}

