
    public class Operation {

        public static int addition(int a, int b) throws TooLargeValueException {
            if (a > Integer.MAX_VALUE - b) {
                throw new TooLargeValueException();
            }
            return a + b;
        }

        public static int sous(int a, int b) throws TooLargeValueException {
            if (a < Integer.MIN_VALUE + b) {
                throw new TooLargeValueException();
            }
            return a - b;
        }

        public static int multiplication(int a, int b) throws TooLargeValueException {
            if (a > Integer.MAX_VALUE / b) {
                throw new TooLargeValueException();
            }
            return a * b;
        }

        public static int division(int a, int b) throws IllegalDivisionException {
            if (b == 0) {
                throw new IllegalDivisionException("division par zéro impossible");
            }
            return a / b;
        }
    }

