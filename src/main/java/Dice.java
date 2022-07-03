import java.util.Random;

public class Dice {
    private int tossedDies;
    private final int sixSides;

    public static Random randomNumber = new Random();

    public Dice(int tossedDies){
        this.tossedDies = tossedDies;
        this.sixSides = 6;
    }

    public int tossAndSum(){
        int count = 0;
        int sumOfDice = 0;
        for (int i = 0; i < count; i++){
            sumOfDice += randomNumber.nextInt(sixSides) + 1;
        }
        return sumOfDice;
    }
    public int getTossedDies(){
        return tossedDies;
    }
    public int getSixSides(){
        return sixSides;
    }
}
