class StringsNumberExpressionService {


    public StringsNumberExpression getStringsNumberExpression(String input) throws Exception {
        String operator = getOperator(input);
        String[] numbers = input.split(operator,2);
        String firstNumber = numbers[0].trim();
        String secondNumber = numbers[1].trim();
        boolean isRoman = getRoman(firstNumber);
        return new StringsNumberExpression(firstNumber, secondNumber, operator, isRoman);
    }

    private String getOperator(String input) throws Exception {
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '-') {
                return "\\-";
            }
            if (ch == '+') {
                return "\\+";
            }
            if (ch == '*') {
                return "\\*";
            }
            if (ch == '/') {
                return "\\/";
            }

        }

        throw new Exception("//т.к. строка не является математической операцией");
    }


    private boolean getRoman(String one) {
        for (int i = 0; i < one.length(); i++) {
            if (!Character.isDigit(one.charAt(i))) return true;
        }
        return false;
    }
}


