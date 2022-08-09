import java.util.Objects;

public class Simulation{
    private int dice;
    private int tosses;

    private StringBuilder result;

    public Simulation(int tosses) {
        this.dice = 2;
        this.tosses = tosses;
        this.result = new StringBuilder();
    }

    public int getDice() {
        return dice;
    }

    public void setDice(int dice) {
        this.dice = dice;
    }

    public int getTosses() {
        return tosses;
    }

    public void setTosses(int tosses) {
        this.tosses = tosses;
    }

    public StringBuilder getResult(){
        return result;
    }

    public void clearResults() {
        result = new StringBuilder();
    }

    public void parseResults(Bins bins){
        clearResults();
    }

    public void runSimulation(){
        Dice dice = new Dice(getTosses());
        Bins bins = new Bins(getDice() * 6);
    }
}
