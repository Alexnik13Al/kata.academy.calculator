public class IntToRoman {

    static String methoodintToRoman(int num) {
        String resultStr = "";

        if (num == 100) {
            resultStr += "C";
            num = num - 100;
        }
        if (num >= 90) {
            resultStr += "XC";
            num = num - 90;
        }
        if (num >= 50) {
            resultStr += "L";
            num = num - 50;
        }
        if (num >= 40) {
            resultStr += "XL";
            num = num - 40;
        }
        if (num >= 30) {
            resultStr += "XXX";
            num = num - 30;
        }
        if (num >= 20) {
            resultStr += "XX";
            num = num - 20;
        }
        if (num >= 10) {
            resultStr += "X";
            num = num - 10;
        }
        if (num >= 9) {
            resultStr += "IX";
            num = num - 9;
        }
        if (num >= 5) {
            resultStr += "V";
            num = num - 5;
        }
        if (num >= 4) {
            resultStr += "IV";
            num = num - 4;
        }
        if (num >= 3) {
            resultStr += "III";
            num = num - 3;
        }
        if (num >= 2) {
            resultStr += "II";
            num = num - 2;
        }
        if (num >= 1) {
            resultStr += "I";
            num = num - 1;
        }

        return resultStr;
    }

}
