class Validation {


    public void stringsNumberExpressionValidator(StringsNumberExpression stringsNumberExpression) throws Exception {
        String firstNumber = stringsNumberExpression.getFirstNumber();
        String secondNumber = stringsNumberExpression.getSecondNumber();
        String operator = stringsNumberExpression.getOperator();
        boolean isRoman = stringsNumberExpression.isRoman();


        if (firstNumber == null || firstNumber.isEmpty()) {
            throw new Exception("//т.к. строка не является математической операцией");
        }
        if (secondNumber == null || secondNumber.isEmpty()) {
            throw new Exception("//т.к. строка не является математической операцией");
        }
        if (operator == null || operator.isEmpty()) {
            throw new Exception("//т.к. строка не является математической операцией");
        }


        if (isRoman) {
            validateRomanStringNumber(firstNumber);
            validateRomanStringNumber(secondNumber);
        } else {
            validateArabicStringNumber(firstNumber);
            validateArabicStringNumber(secondNumber);
        }

    }

    private void validateArabicStringNumber(String s) throws Exception {
        for (int i = 0; i < s.length(); i++) {
         char ch = s.charAt(i);
            boolean isDigit = Character.isDigit(ch);
            if(!isDigit){
                throw new Exception("//т.к. используются одновременно разные системы счисления");
            }
        }
    }

    void validateRomanStringNumber(String s) throws Exception {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'I' && s.charAt(i) != 'V' && s.charAt(i) != 'X') {
                throw new Exception("//т.к. формат математической операции не удовлетворяет заданию");
            }
        }

    }


    public void intNumberExpressionValidator(IntNumberExpression intNumberExpression) throws Exception {
        int firstNumber = intNumberExpression.getFirstNumber();
        int secondNumber = intNumberExpression.getSecondNumber();


        if (firstNumber > 10 || firstNumber < 1) {
            throw new Exception("Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более.");
        }
        if (secondNumber > 10 || secondNumber < 1) {
            throw new Exception("Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более.");
        }


    }

    public void resultNumberExpressionValidator(int result, boolean isRoman) throws Exception {

        if (isRoman && result <= 0) {
            throw new Exception("//т.к. в римской системе нет отрицательных чисел и 0");
        }

    }
}




