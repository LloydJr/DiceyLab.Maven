import java.util.Random;

public class Dice {
    private final int tossedDies;
    private int sixSides;
    public static Random randomNumber = new Random();

    public Dice(int tossedDies) {
        this.tossedDies = tossedDies;
        this.sixSides = 6;
    }

    public Dice(int tossedDies, int sixSides) {
        this.tossedDies = tossedDies;
        this.sixSides = sixSides;
    }

    public int getTossedDies() {
        return tossedDies;
    }

    public int getSixSides() {
        return sixSides;
    }

    public int tossAndSum() {
        int sumOfDice = 0;
        for (int i = 0; i < tossedDies; i++) {
            sumOfDice += randomNumber.nextInt(sixSides) + 1;
        }
        return sumOfDice;
    }
}
