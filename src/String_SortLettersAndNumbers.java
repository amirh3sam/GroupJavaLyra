import java.util.Arrays;

public class String_SortLettersAndNumbers {
    /*
     Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
    sort the individual string and append them back together
        Ex:
            Input: "DC 501 GCCCA 098911"
            Output: "CD015ACCCG011899"

     */

    public static void main(String[] args) {
        sortLettersAndNumbers("DC501GCCCA098911");
    }

    public static String sortLettersAndNumbers(String str){
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            temp+= ""+str.charAt(i); // add each element into the temp value
            if (Character.isAlphabetic(str.charAt(i)) && i<str.length()-1){ //if the element is alphabet, we are
                if (Character.isDigit(str.charAt(i + 1))) {//going to check if the one next to it is digit, if so
                    temp += ",";//we are going to separate the alphabet from the digit by adding ","
                }
            }

            if (Character.isDigit(str.charAt(i)) && i < str.length() - 1) { //if the element is digit, we are
                if (Character.isAlphabetic(str.charAt(i + 1))) {//going to check if the one next to it is alphabet, if so
                    temp += ",";//we are going to separate the digit from the alphabet by adding ","
                }
            }
        }


        String[] arr = temp.split(","); //create a String Array by splitting the temp using the ","
        str = "";

        for (String each : arr) { //for each loop for the String array for example DC
            char[] chars = each.toCharArray(); //to convert each into a char array [D,C]
            Arrays.sort(chars); //sort each array using sort method, so it will become [C,D]
            for (char eachChar : chars) { // for each char in the array will be added back into the string
                str += "" + eachChar;
            }
        }

        return str;

    }
}
