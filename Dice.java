package java_fundamentals;

import java.util.Random;

public class Dice {
    public int sides;

    public Dice(int sides){
        this.sides=sides;
    }

    public int getSides() {
        return this.sides;
    }

    public void setSides(int side) {
        this.sides = side;
    }

    public int roll() {
        Random rnd = new Random();

        return rnd.nextInt(this.sides) + 1;
    }
}
