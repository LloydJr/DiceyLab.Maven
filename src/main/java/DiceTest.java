import org.junit.Test;
import org.junit.Assert;

class DiceTest {

    @Test
    public void testOne(){
        Dice dice = new Dice(2);
        int results = dice.getTossedDies(); //Act
        Assert.assertEquals(2, results); //Assert
    }
}