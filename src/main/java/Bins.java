import java.sql.Array;
import java.util.*;

public class Bins {

     int diceNumber;
     int totalSim;

    public Bins(int diceNumber, int totalSim) {
        this.diceNumber = diceNumber;
        this.totalSim = totalSim;
    }

    public int[] numberOfRolls(){
        Dice dies = new Dice(diceNumber);
        int[] results = new int [diceNumber * 6];

            for (int i = 0; i < totalSim; i++)
            results[dies.tossAndSum() - 1] += 1;
        return results;
    }
}