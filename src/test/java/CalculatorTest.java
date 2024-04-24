import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest {

    @Test
    public void testAddNums(){
        Calculator calc = new Calculator();

        int result = calc.addNums(2,3);
        int expected = 5;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void testSubNums(){
        Calculator calc = new Calculator();

        int result = calc.subNums(10,3);
        int expected = 7;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void testMulNums(){
        Calculator calc = new Calculator();

        int result = calc.mulNums(7,3);
        int expected = 21;
        Assert.assertEquals(expected,result);
    }

    @Test
    public void testDivNums(){
        Calculator calc = new Calculator();

        int result = calc.divNums(10,2);
        int expected = 5;
        Assert.assertEquals(expected,result);
    }

}
