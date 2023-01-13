package question7;

public class Question7 {

     /*
        Write a method that can check if a number is prime or not

        // a whole number greater than 1 that cannot be exactly divided by any whole number other than itself
        and 1 (e.g. 2, 3, 5, 7, 11).
     */


    public static boolean primeNumber(int num) {
        if (num < 2) { // if the number is less than 2
            return false; // return false here, exit the program
        }

        for (int i = 2; i < num; i++) {// if the first condition is not false,
            if (num % i == 0) {// then check if the number is divisible by 2 or any other whole number up to the number
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {

        System.out.println(primeNumber(11));

    }
}
