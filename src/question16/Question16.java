package question16;

public class Question16 {
    public static void main(String[] args) {

        String sequence = "abc231abc1";
        System.out.println("sumOfDigits(sequence) = " + sumOfDigits(sequence));

    }


    public static int sumOfDigits(String str){

        int sum =0;

        for (int i=0; i< str.length(); i++){
            char c = str.charAt(i);
            if (Character.isDigit(c)){
                sum += Character.getNumericValue(c);
            }
        }
        return sum;



    }
}
