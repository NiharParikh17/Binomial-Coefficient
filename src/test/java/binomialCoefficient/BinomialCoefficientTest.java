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

    @Test
    public void pascalsTest12c6_924() {
        long expected = 924;
        long actual = BinomialCoefficient.pascalsMethod(12, 6);
        assertEquals(expected, actual);
    }

    @Test
    public void pascalsTest6c12_neg1() {
        long expected = -1;
        long actual = BinomialCoefficient.pascalsMethod(6, 12);
        assertEquals(expected, actual);
    }

    @Test
    public void dynamicTest50c5_2118760() {
        long expected = 2118760;
        long actual = BinomialCoefficient.dynamicMethod(50, 5);
        assertEquals(expected, actual);
    }

    @Test
    public void dynamicTest35c50_neg1() {
        long expected = -1;
        long actual = BinomialCoefficient.dynamicMethod(35, 50);
        assertEquals(expected, actual);
    }
}
