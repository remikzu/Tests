import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Remigiusz Zudzin
 */
class SumClassTest {
    double a = 10;
    double b = 1;

    private static SumClass sumClass = new SumClass();
    @Test
    void sumTest1() {

        Assertions.assertAll("Asercje do SumClass",
                () -> assertEquals(a + b, sumClass.sum(a, b)),
                () -> assertEquals(a * b, sumClass.multiply(a, b)),
                () -> assertEquals(a - b, sumClass.substract(a, b)),
        () -> assertEquals(a / b, sumClass.calculate(a, b, Calculation.DIVIDE)));
    }
    @Test
    @DisplayName("Test Calculation (Enum)")
    void enumTest1() {
        Assertions.assertAll("Asercje do Calculation",
                () -> assertEquals(a + b, sumClass.calculate(a, b, Calculation.ADD)),
                () -> assertEquals(a - b, sumClass.calculate(a, b, Calculation.SUBSTRACT)),
                () -> assertEquals(a * b, sumClass.calculate(a, b, Calculation.MULTIPLY)),
                () -> assertEquals(a / b, sumClass.calculate(a, b, Calculation.DIVIDE)));
    }

}