public class RomanToInt {

    public static int methodRomanToInt(String s) throws Exception{
        String currentS = s;

        int result = 0;

        if (currentS.startsWith("X")) {
            result += 10;
            currentS = currentS.substring(1);
        }
        if (currentS.startsWith("IX")) {
            result += 9;
            currentS = currentS.substring(2);
        } else {

            if (currentS.startsWith("V")) {
                result += 5;
                currentS = currentS.substring(1);
            }
            if (currentS.startsWith("IV")) {
                result += 4;
                currentS = currentS.substring(2);
            } else {
                if (currentS.startsWith("III")) {
                    result += 3;
                    currentS = currentS.substring(3);
                }else {
                    if (currentS.startsWith("II")) {
                        result += 2;
                        currentS = currentS.substring(2);
                    }
                    if (currentS.startsWith("I")) {
                        result += 1;
                        currentS = currentS.substring(1);
                    }
                }
            }
        }
if (!currentS.isEmpty()){
    throw new Exception("// Римское число введенно неверно");
}
        return result;
    }

}
