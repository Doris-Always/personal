package check;

import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class NumberProblemsTest {
    @Test
    public void testThatFactorsOfNumBersAreCounted(){
        NumberProblems num = new NumberProblems();
        int number = num.factorOfNumbers(3);
        assertEquals(2,number);
    }

    @Test
    public void testThatNumberIsAPrime(){
        NumberProblems num = new NumberProblems();
        assertTrue(num.primeNumber(8));

    }
}
