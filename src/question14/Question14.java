package question14;

public class Question14 {
    public static void main(String[] args) {

        System.out.println("passwordValidation(\"Strong&12\") = " + passwordValidation("Strong&12"));
    }


    public static boolean passwordValidation(String str) {
        int uCase = 0;
        int lcase = 0;
        int digit = 0;
        int symbol = 0;
        int a = 0;

        if (str.length() >= 6 && !str.contains(" ")) {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (Character.isUpperCase(ch)) {
                    uCase = 1;
                }
                if (Character.isLowerCase(ch)) {
                    lcase = 1;
                }
                if (!Character.isLetterOrDigit(ch)) {
                    digit = 1;
                }
                if (Character.isDigit(ch)) {
                    symbol = 1;
                }
            }

        } else {
            return false;
        }

        a = uCase + lcase + digit + symbol;

        if (a == 4) {
            return true;
        } else {
            return false;
        }
    }




}
