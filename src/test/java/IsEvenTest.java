import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Remigiusz Zudzin
 */
class IsEvenTest {

    int a = 4;
    IsEven isEven = new IsEven();
    @Test
    @DisplayName("Czy parzyste?")
    void isEvenTest() {
        assertTrue(isEven.IsEven(a));
    }

}