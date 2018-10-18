import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    @Test
    public void checkStartNumbers(){
        Calculator calculator = new Calculator();
        int[] number = calculator.takeNumbers(5, 2);
        assertEquals(5,number[0]);
        assertEquals(2,number[1]);
    }

    @Test
    public void shouldBeSum(){
        Calculator calculator = new Calculator();
        int[] number = calculator.takeNumbers(7, 6);
        int result = calculator.makeAction("+", number);
        assertEquals(13, result);
    }

    @Test
    public void shouldBeSubtract() {
        Calculator calculator = new Calculator();
        int[] number = calculator.takeNumbers(10, 6);
        int result = calculator.makeAction("-", number);
        assertEquals(4, result);
    }

    @Test
    public void shouldBeMultiply() {
        Calculator calculator = new Calculator();
        int[] number = calculator.takeNumbers(5, 6);
        int result = calculator.makeAction("*", number);
        assertEquals(30, result);
    }

    @Test
    public void shouldBeDivide() {
        Calculator calculator = new Calculator();
        int[] number = calculator.takeNumbers(30, 6);
        int result = calculator.makeAction("/", number);
        assertEquals(5, result);
    }
}
