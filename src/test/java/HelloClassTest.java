import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Remigiusz Zudzin
 */
class HelloClassTest {
    private static HelloClass helloClass = new HelloClass();
    @Test
    void HelloTest() {
        Assertions.assertEquals("Hello World!", helloClass.getMessage());
    }

    @Test
    void Test2() {
        Assertions.assertEquals("HLO WRLD", helloClass.getMessage());
    }
    @Test
    void Test3() {
        Assertions.assertEquals("Cos innego", helloClass.getMessage());
    }

}