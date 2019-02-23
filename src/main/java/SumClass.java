/**
 * @author Remigiusz Zudzin
 */
class SumClass {

    double sum(double a, double b) {
        return a + b;
    }

    double multiply(double a, double b) {
        return a*b;
    }

    double substract(double a, double b) {
        return a - b;
    }

    Double calculate(double a, double b, Calculation calculation) {
        switch(calculation) {
            case ADD: return a + b;
            case SUBSTRACT: return a - b;
            case MULTIPLY: return a * b;
            case DIVIDE: {
                if (b == 0) throw new IllegalArgumentException("Nie dziel przez 0!");
                else return a / b;
            }
            default:
                System.out.println("Nie wskazales zadnej metody, wychdze z programu!");
                return null;
        }
    }

}
