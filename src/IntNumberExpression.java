public class IntNumberExpression {
    private int firstNumber;
    private int secondNumber;
    private String operator;
    private boolean isRoman;

    public IntNumberExpression(int firstNumber, int secondNumber, String operator, boolean isRoman) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operator = operator;
        this.isRoman = isRoman;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public String getOperator() {
        return operator;
    }

    public boolean isRoman() {
        return isRoman;
    }
}
