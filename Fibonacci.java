public class Fibonacci {
    public static int calculerFibonacci(int n) throws InvalidFibonacciInputException {
        if (n <= 0) {
            throw new InvalidFibonacciInputException("L'entier saisi doit être supérieur à 0.");
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int a = 1, b = 1, c = 0;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}