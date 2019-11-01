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
}
