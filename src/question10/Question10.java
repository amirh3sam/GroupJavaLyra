package question10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question10 {

    /*
    String
Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex:
same(" abc ",","cab"); --> true
same("
abc abb "); -->
     */

    public static boolean checkIfBuildWithSameLetters(String str1, String str2){
        char[] arr1 = str1.toCharArray();

        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean returnResult = true ? Arrays.equals(arr1, arr2):false;


        return returnResult;

    }

    public static void main(String[] args) {

        System.out.println(checkIfBuildWithSameLetters("abc", "dbac"));

    }
}
