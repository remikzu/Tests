import java.util.Scanner;
import java.util.Stack;

/**
 * @author Remigiusz Zudzin
 */
public class ONP {

    public static void ONP() {
        Stack stack = new Stack();
        String result = "";
        String statement = "";
        boolean sign = true; //wskazuje że znak - jest znakiem przed liczbą, nie operacją odejmowania

        System.out.println("Podaj wyrażenie");
        Scanner sc = new Scanner(System.in);
        statement = sc.next();
        statement.replace(" ", "");

        for (int i = 0; i < statement.length(); i++) {
            if (statement.charAt(i) == '(') {
                stack.push('(');
                sign = true;
                result += " ";
            }
        }
    }

    public static void main(String[] args) {

    }

}
