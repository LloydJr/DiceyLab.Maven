import java.sql.Array;
import java.util.*;

public class Bins {
    ArrayList<Integer> results;
    public Bins (int maximum) {
        results = new ArrayList<>(Collections.nCopies(maximum + 1, 0));
    }
    public Integer getBin(int bin) {
        return this.results.get(bin);
    }
    public void add(int bin) {
        results.set(bin, results.get(bin) + 1);
    }
    public int size() {
        return results.size();
    }
}