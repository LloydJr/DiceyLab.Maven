
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DiceTest {
    @Test
    public void testDiceOne() {
        Dice dice;
        dice = new Dice(2);
        int results = dice.getTossedDies(); //Act
        Assertions.assertEquals(2, results); //Assert
    }

    @Test
    public void testDiceTwo() {
        Dice dice;
        dice = new Dice(2, 5);
        int results = dice.getSixSides(); //Act
        Assertions.assertEquals(5, results); //Assert
    }

    @Test
    public void testTossedDiesOne() {
        Dice dice;
        dice = new Dice(2);
        int tossSum = dice.tossAndSum(); //Act
        boolean results = tossSum >= 2 && 12 >= tossSum;
        Assertions.assertTrue(results); //Assert
    }
}