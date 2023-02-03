package question11;

public class Question11_Mustapha_Michelle {

    public static String removeDup(String str){


        String result = ""; // to store no duplicated character from the string


        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);// get each character in the string

            if(!result.contains(""+each)) { // if current char result not duplicated
                result += each;
            }

        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(removeDup("AAABBBCCC"));

    }


}


/*
String
Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex:
removeDup (" AAABBBCCC")==> ABC
 */


