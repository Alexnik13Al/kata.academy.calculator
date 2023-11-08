 class ArithmeticOperations {

    static int getResult(IntNumberExpression intNumberExpression) throws Exception {
        int a = intNumberExpression.getFirstNumber();
        int b = intNumberExpression.getSecondNumber();


        switch (intNumberExpression.getOperator()) {
            case "\\+":
                return a + b;
            case "\\-":
                return a - b;
            case "\\*":
                return a * b;
            case "\\/":
                return a / b;
        }
        throw new Exception();
    }
}
