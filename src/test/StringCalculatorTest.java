package test;

import main.StringCalculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringCalculatorTest {
    @Test
    public void 문자열이_null_또는_빈값일때() throws Exception{
        assertEquals(StringCalculator.splitAndSum(null), 0);
        assertEquals(StringCalculator.splitAndSum(""), 0);
    }

    @Test
    public void 값_한개() {
        assertEquals(StringCalculator.splitAndSum("1"), 1);
    }

    @Test
    public void 값_두개() {
        assertEquals(StringCalculator.splitAndSum("1,12"), 13);
    }

    @Test
    public void 값_세개() {
        assertEquals(StringCalculator.splitAndSum("1,3:2"), 6);
    }
}
