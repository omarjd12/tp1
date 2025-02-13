public class ExpressionParenthesee {
    private String expression;

    public ExpressionParenthesee(String expression) throws ParentheseException {
        this.expression = expression;
        verifierParentheses();
    }

    private void verifierParentheses() throws ParentheseException {
        int balance = 0;
        for (char c : expression.toCharArray()) {
            if (c == '(') {
                balance++;
            } else if (c == ')') {
                balance--;
            }
            if (balance < 0) {
                throw new ParentheseFermanteException("Trop de parenthèses fermantes.");
            }
        }
        if (balance > 0) {
            throw new ParentheseOuvranteException("Trop de parenthèses ouvrantes.");
        }
    }

    public String getString() {
        return expression;
    }
}