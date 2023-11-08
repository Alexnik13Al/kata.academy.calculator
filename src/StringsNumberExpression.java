class StringsNumberExpression {
    private String firstNumber;
    private static String secondNumber;
    private String operator;
    private boolean isRoman;

    public StringsNumberExpression(String firstNumber, String secondNumber, String operator, boolean isRoman) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operator = operator;
        this.isRoman = isRoman;
    }

    public String getFirstNumber() {
        return firstNumber;
    }

    public static String getSecondNumber() {
        return secondNumber;
    }

    public String getOperator() {
        return operator;
    }

    public boolean isRoman() {
        return isRoman;
    }
}
