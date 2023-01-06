package question1;

import java.util.Scanner;

public class Odd_Even {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = input.nextInt();


        //int num =5;


        if (num % 2 == 0) {
            System.out.println("This is even number: " + num);
        } else {
            System.out.println("This is odd number: " + num);
        }

    }


        /*
        Write a method to identify odd an even number
         */

}
