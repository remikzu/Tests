package ZegarBerlinski;

import com.sun.org.glassfish.gmbal.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author nieckarz
 */
class MengenClockTest {


    @Description("Test czy metoda parsuje aktualną Godzinę na czas Mengenlehreuhr")
    @Test
    void isValidParseTimeHourse() {
        MengenClock mengenCLock = new MengenClock();
        mengenCLock.parseTimeHours(14);
        Assertions.assertEquals(2, mengenCLock.getHourLine1());
        Assertions.assertEquals(4, mengenCLock.getHourLine2());
    }

    @Description("Test czy metoda parsuje aktualne minuty na czas Mengenlehreuhr")
    @Test
    void isValidParseTimeMinutes() {
        MengenClock mengenCLock = new MengenClock();
        mengenCLock.parseTimeMinutes(59);
        Assertions.assertEquals(11, mengenCLock.getMinutesLine1());
        Assertions.assertEquals(4, mengenCLock.getMinutesLine2());
    }

    @Description("Metoda parsująca godziny i minuty na czas Mengenlehreuhr")
    @Test
    void isValisParseTime() {
        MengenClock mengenCLock = new MengenClock();
        mengenCLock.parseTime(14,59);
        Assertions.assertAll("Metoda parsująca godziny i minuty na czas Mengenlehreuhr",
                () -> Assertions.assertEquals(2, mengenCLock.getHourLine1()),
                () -> Assertions.assertEquals(4, mengenCLock.getHourLine2()),
                () -> Assertions.assertEquals(11, mengenCLock.getMinutesLine1()),
                () -> Assertions.assertEquals(4, mengenCLock.getMinutesLine2()));
    }

    @Description("Metoda parsująca godziny i minuty na czas Mengenlehreuhr po Stringu")
    @Test
    void isValisParseTimeString() {
        MengenClock mengenCLock = new MengenClock("14:59");
        Assertions.assertAll("Metoda parsująca godziny i minuty na czas Mengenlehreuhr po Stringu",
                () -> Assertions.assertEquals(2, mengenCLock.getHourLine1()),
                () -> Assertions.assertEquals(4, mengenCLock.getHourLine2()),
                () -> Assertions.assertEquals(11, mengenCLock.getMinutesLine1()),
                () -> Assertions.assertEquals(4, mengenCLock.getMinutesLine2()));
    }
}