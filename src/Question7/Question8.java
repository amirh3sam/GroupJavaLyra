package Question7;

public class Question8 {
// This solution actually works with positive numbers also!

    /*
    Numbers - Reverse Negative number

Write a return method that can reverse negative number and return it as int


     */

    /*
        public static int reverse(int number){
            if(number < 10 && number >= 0){ // we need the number
                return number;
            }

            int result = 0;
            while (number !=0) {
                result = result * 10 + number % 10;
                number /= 10;
            }

            return result;
        }



     */
    public static int reverse(int number) {
        boolean isNegative = number < 0 ? true : false;

        if (isNegative) {
            number = number * -1;// we multiply it by -1 to make it a positive number
        }
        int reverse = 0; // will hold our reversed number
        int lastDigit = 0; // to hold our last digit
        while (number >= 1) { // as long as the number is greater than 1

            lastDigit = number % 10; // gives you last digit, the remainder of the number divided by 10 will give you
            // the last digit
            reverse = reverse * 10 + lastDigit;// this will just add an extra digit to the number to which
            // we add our last digit
            number = number / 10; // get rid of last digit
        }
        return isNegative == true ? reverse * -1 : reverse;

    }

    public static void main(String[] args) {
        System.out.println(reverse(75));
    }

}



