package Question11;

public class Question11 {
    /*
    String
Remove Duplicates

Write a return method that can remove the duplicated values from
String
Ex:
removeDup (" AAABBBCCC")==> ABC
     */

    public static String removeDuplicatesFromString(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {
                result += "" + str.charAt(i);

            }
        }

        return result;
    }

    public static void main(String[] args) {

        String result = removeDuplicatesFromString("AlphaBetaAB");
        System.out.println(result);
    }

}
