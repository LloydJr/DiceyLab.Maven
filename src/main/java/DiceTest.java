
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DiceTest {
    @Test
    public void testDiceOne() {
        Dice dice;
        dice = new Dice(1);
        int results = dice.getDies(); //Act
        Assertions.assertEquals(1, results); //Assert
    }

    @Test
    public void testDiceTwo() {
        Dice dice;
        dice = new Dice(2, 6);
        int results = dice.getSixSides(); //Act
        Assertions.assertEquals(6, results); //Assert
    }

    @Test
    public void testTossedDiesOne() {
        Dice dice;
        dice = new Dice(4);
        int tossSum = dice.tossAndSum(); //Act
        boolean results = tossSum >= 4 && 24 >= tossSum;
        Assertions.assertTrue(results); //Assert
    }
}