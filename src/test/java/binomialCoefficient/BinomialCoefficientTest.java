package binomialCoefficient;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinomialCoefficientTest {
    @Test
    public void factorialTest10_3628800() {
        long expected = 3628800;
        long actual = BinomialCoefficient.factorial(10);
        assertEquals(expected, actual);
    }

    @Test
    public void definitionTest10c3_120() {
        long expected = 120;
        long actual = BinomialCoefficient.definitionMethod(10, 3);
        assertEquals(expected, actual);
    }

    @Test
    public void definitionTest3c10_neg1() {
        long expected = -1;
        long actual = BinomialCoefficient.definitionMethod(3, 10);
        assertEquals(expected, actual);
    }
}
