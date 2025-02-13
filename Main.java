public class Main {
    public static void main(String[] args) {
        try {
            // Test de OperationArithmetique
            int resultAddition = Operation.addition(10, 20);
            System.out.println("Addition: " + resultAddition);

            int resultDivision = Operation.division(10, 0); // Cela lèvera IllegalDivisionException
            System.out.println("Division: " + resultDivision);

            // Test de Fibonacci
            int fib = Fibonacci.calculerFibonacci(5);
            System.out.println("Fibonacci: " + fib);

            // Test de ExpressionParenthesee
            ExpressionParenthesee expr = new ExpressionParenthesee("(a + b) - (c + d)");
            System.out.println("Expression correcte : " + expr.getString());
        } catch (TooLargeValueException e) {
            System.out.println("Erreur : " + e.getMessage());
        } catch (IllegalDivisionException e) {
            System.out.println("Erreur de division : " + e.getMessage());
        } catch (InvalidFibonacciInputException e) {
            System.out.println("Erreur Fibonacci : " + e.getMessage());
        } catch (ParentheseException e) {
            System.out.println("Erreur de parenthèse : " + e.getMessage());
        }
    }
}