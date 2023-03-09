package question3;

public class Test_removeDuplicates {


        //String -- Remove Duplicates
        //Write a return method that can remove the duplicated values from
        //String
        //Ex: removeDup("AAABBBCCC") ==> ABC

        public static String removeDuplicates(String word){

            String result = "";

            for (int i = 0; i < word.length(); i++){
                if (!result.contains(""+ word.charAt(i))){
                    result+= "" + word.charAt(i);
                }
            }

            return result;

        }

        public static void main(String[] args) {

            String test = "aaaabcccccddddeeeeeeeeeeeef";
            System.out.println("removeDuplicates(test) = " + removeDuplicates(test));
        }

    }
