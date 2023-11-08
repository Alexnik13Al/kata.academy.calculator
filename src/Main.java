import java.util.Scanner;

public class Main {

    public static String calc(String input) throws Exception {

        StringsNumberExpressionService stringsNumberExpressionService = new StringsNumberExpressionService();
        StringsNumberExpression stringsNumberExpression = stringsNumberExpressionService.getStringsNumberExpression(input);


        Validation validation = new Validation();
        validation.stringsNumberExpressionValidator(stringsNumberExpression);


        IntNumberExpressionService intNumberExpressionService = new IntNumberExpressionService();
        IntNumberExpression intNumberExpression = intNumberExpressionService.getIntNumberExpression(stringsNumberExpression);

        validation.intNumberExpressionValidator(intNumberExpression);


        int result = ArithmeticOperations.getResult(intNumberExpression);

        validation.resultNumberExpressionValidator(result, stringsNumberExpression.isRoman());

        if (intNumberExpression.isRoman()) {
            return IntToRoman.methoodintToRoman(result);
        } else {
            return Integer.toString(result);
        }

    }


    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(calc(input));

    }

}
