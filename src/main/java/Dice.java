import java.util.Random;

public class Dice {
    public static void setRandomNumber(Random randomNumber) {
        Dice.randomNumber = randomNumber;
    }

    private final int dies;
    private final int sixSides;
    public static Random randomNumber = new Random();

    public Dice(int dies) {
        this.dies = dies;
        this.sixSides = 6;
    }

    public Dice(int tossedDies, int sixSides) {
        this.dies = tossedDies;
        this.sixSides = sixSides;
    }

    public int getDies() {
        return dies;
    }

    public int getSixSides() {
        return sixSides;
    }

    public int tossAndSum() {
        int sumOfDice = 0;
        for (int i = 0; i < dies; i++) {
            sumOfDice += randomNumber.nextInt(sixSides) + 1;
        }
        return sumOfDice;
    }
}
