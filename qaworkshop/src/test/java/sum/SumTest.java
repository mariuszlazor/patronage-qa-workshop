package sum;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SumTest {
    private Sum sum;

    //Metoda oznaczona adnotacją BeforeMethod jest wykonywana przed każdą metodą oznaczoną @Test - w tym konkretnym przypadku przed każdym testem tworzymy obiekt terstowanej klasy
    @BeforeMethod
    public void createSumObject() {
        sum = new Sum();
    }

    //Test, który zakończy się powodzeniem, ponieważ przekazujemy do testowanej metody 1 i 1
    @Test
    public void sumPositive() {
        int x = sum.calculateSum(1,1);
        Assert.assertEquals(x, 2, "Expected sum: 2, got: " + x);
    }

    //Test, który zakończy się niepowodzeniem, ponieważ testowana metoda zawsze zwraca nam 2
    @Test
    public void sumNegative() {
        int x = sum.calculateSum(2,1);
        Assert.assertEquals(x, 3, "Expected sum: 3, got: " + x);
    }
}
