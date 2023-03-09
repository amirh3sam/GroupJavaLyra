package question12;

public class Question12 {

    /*
String -- Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
     */

    public static String findUniqueCharacters(String str){
        String unique = "";
        String[] arr = str.split("");

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j].equals(arr[i])){
                    count++;
                }
            }
            if(count == 1){
                unique += arr[i];
            }
        }

        return unique;
    }

    public static void main(String[] args) {
        System.out.println(findUniqueCharacters("LGGHHIMMSSA"));
    }
}
