package question9;

public class Question9 {

    /*
    String
Frequency of Characters
Write a return method that can find the frequency of
characters
Ex:
FrequencyOfChars ("AAABBCDD") ==> A3B2C1D2
     */

    public static String frequencyOfCharacters(String str){
        String result = "";
        int count = 0;
        char temp = str.charAt(0);


        for (char each : str.toCharArray()) {
              if(temp == each){
                  count++;
              }else{
                  result += " " + temp + count;
                  temp = each;
                  count = 1;
              }
        }
        result += " " + temp + count;
        return result;
    }

    public static void main(String[] args) {

       String result = frequencyOfCharacters("HelloMyCideoFriends");
        System.out.println("result = " + result);
    }
}
