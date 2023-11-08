public class IntNumberExpressionService {


    public IntNumberExpression getIntNumberExpression(StringsNumberExpression stringsNumberExpression) throws Exception {
        final boolean isRoman = stringsNumberExpression.isRoman();
        String firstNumber = stringsNumberExpression.getFirstNumber();
        String secondNumber = stringsNumberExpression.getSecondNumber();
        String operator = stringsNumberExpression.getOperator();


        int firstNumber1;
        int secondNumber1;
        if (isRoman) {
            firstNumber1 = RomanToInt.methodRomanToInt(firstNumber);
            secondNumber1 = RomanToInt.methodRomanToInt(secondNumber);
        } else {
            firstNumber1 = Integer.parseInt(firstNumber);
            secondNumber1 = Integer.parseInt(secondNumber);
        }
        return new IntNumberExpression(firstNumber1, secondNumber1, operator, isRoman);

    }
}
