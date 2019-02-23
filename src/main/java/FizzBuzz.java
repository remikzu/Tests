import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;

/**
 * @author Remigiusz Zudzin
 */
public class FizzBuzz {



    String FindIfNumberContains(Integer a) {
        int[] number = a.toString().chars().map(c -> c - '0').toArray();
        if (number.length > 2) throw new IllegalArgumentException("Liczby powinny być dwucyfrowe!");
        if (a == 35 || a == 53) {
            return "fizzbuzz";
        }
        for (int i = 0; i < number.length; i++) {
            if (number[i] == 3) {
                return "fizz";
            } else if (number[i] == 5) {
                return "buzz";
            }
        }
        return null;
    }

    String isDividedBy3Or5or3And5 (Integer a) {
        if (a % 3 == 0 && a % 5 != 0) {
            return "fizz";
        } else if (a % 5 == 0 && a % 3 != 0) {
            return "buzz";
        } else if (a % 3 == 0 && a % 5 == 0) {
            return "fizzbuzz";
        } else return a.toString();
    }

}
