package leaguetdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCalculator {

    // For all 3 test methods you will create remember to add @Test before the method 

    // Create a Test for the add method called testAdd 


    // Create a Test for the subtract method called testSubtract

    // testets();
    // testets1();
    // testets2();

    @Test
    public void testets(){
        assertEquals(Calculator.add(21,34), 55);
    }

    @Test
    public void tes(){
        assertEquals(Calculator.subtract(34,21), 13);
    }

    @Test
    public void test2(){
        assertEquals(Calculator.factorial(3), 6);
    }

    @Test
    public void timesTest(){
        assertEquals(Calculator.multiplication(99999999, 0), 0);
    }

    @Test
    public void dividesdfas(){
        assertEquals(Calculator.division(999,11), 90);
        assertEquals(Calculator.division(1,0),Integer.MAX_VALUE);
    }
    // Create a Test for the factorial method called testFactorial
    


}

