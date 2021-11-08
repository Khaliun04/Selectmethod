package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertions {


    // create one method that takes 2 parameter as a Integer
    // and return the multiplication of these 2 number

    @Test
    public void validateMulti() {
        int result = getMulti(-2, 4);
        int expected = -8;
        Assert.assertEquals(result, expected, "it is for -2 and 4");
    }

    public int getMulti(int a, int b) {
        return a * b;
    }
    //-2 * 4 = -8
    //3 * 0 = 0
    //3 * 2 = 6
    // -2 * -3 = 6

    @Test
    public void validateZero() {
        int result = getMulti(3, 0);
        int expected = 0;
        Assert.assertEquals(result, expected, "it is for 3 and 0");
    }

    @Test
    public void validatePositive() {
        int result = getMulti(2, 3);
        Assert.assertTrue(result == 6);
    }

    @Test
    public void validateNegative() {
        int result = getMulti(-2, -3);
        int expected = 5;
        Assert.assertEquals(result, expected);
        //when assert fails the next line will not be executed.
        //This is called hard assertion
        System.out.println("Negative test");
    }
}