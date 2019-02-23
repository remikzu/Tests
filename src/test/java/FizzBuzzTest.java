import org.junit.jupiter.api.*;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;

/**
 * @author Remigiusz Zudzin
 */
class FizzBuzzTest {
    static long start;
    static long stop;
    FizzBuzz fizzBuzz = new FizzBuzz();
    @BeforeEach
    void getStartingTime() {
        start = System.nanoTime();
    }

    @BeforeEach
     void getStartDate() {
        System.out.println("Start of tests time: " + LocalDateTime.now().toString());
    }

    @AfterEach
     void getEndDate() {
        System.out.println("Finish of tests time: " + LocalDateTime.now().toString());
    }
    @AfterEach
    void countTime() {
        stop = System.nanoTime();
        System.out.println("Czas dzialania testu: " + (double) (stop - start)/10000000 + " sekundy");
    }
    @Test
    @DisplayName("Asercje do zadania 2 i 3")
    void FizzBuzzTest() {
        Assertions.assertAll("Asercje do zadania 2, 3 i 4",
                () -> Assertions.assertEquals("fizz", fizzBuzz.isDividedBy3Or5or3And5(6)),
                () -> Assertions.assertEquals("buzz", fizzBuzz.isDividedBy3Or5or3And5(5)),
                () -> Assertions.assertEquals("fizzbuzz", fizzBuzz.isDividedBy3Or5or3And5(15)),
                () -> Assertions.assertEquals(Integer.valueOf(13).toString(), fizzBuzz.isDividedBy3Or5or3And5(13)),
                () -> Assertions.assertEquals("fizz", fizzBuzz.FindIfNumberContains(13)),
                () -> Assertions.assertEquals("buzz", fizzBuzz.FindIfNumberContains(15)),
                () -> Assertions.assertEquals("fizzbuzz", fizzBuzz.FindIfNumberContains(35)),
                () -> Assertions.assertEquals("fizzbuzz", fizzBuzz.FindIfNumberContains(53)));
    }

}