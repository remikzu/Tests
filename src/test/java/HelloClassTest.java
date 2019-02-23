import com.sun.org.glassfish.gmbal.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Remigiusz Zudzin
 */
class HelloClassTest {
    private static HelloClass helloClass = new HelloClass();
    @Test
    @DisplayName("Nazwa testu 1")
    @Description("Opis do testu 1")
    void HelloTest() {
        Assertions.assertAll("Asercje do HelloWorld",
                () -> assertEquals("Hello World2!", helloClass.getMessage()),
                () -> assertEquals("Cos innego", helloClass.getMessage()));
    }

//    @Test
//    @DisplayName("Nazwa testu 2")
//    @Description("Opis do testu 2")
//    void Test2() {
//
//    }
//    @Test
//    @DisplayName("Nazwa testu 3")
//    @Description("Opis do testu 3")
//    void Test3() {
//    }

}