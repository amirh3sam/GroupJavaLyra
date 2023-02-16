package question19;

import java.util.Arrays;

public class Question19 {

    //Question3: Array - Sort Descending
    //Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    //Ex: int[] arr = {10,20,7, 8, 90};
    // arr = Sort(arr); ==> {90, 20, 10, 8, 7};
    
    public static int[] sortDescendingOrder(int[] arr) {
        int[] result = Arrays.copyOfRange(arr, 0, arr.length);// this int[] result Array will hold our sorted array

        for (int i = 0; i < result.length; i++) { // first loop will give us access to each element in the array
            for (int j = 0; j < result.length; j++) {// with second loop we will use to compare one element to every next element

                if (result[i] > result[j]) { // if the element at the index i is > then the next element in the array
                    Integer temporary = result[i];// we will assign it to a temporary Integer value, we created to keep track of the elements
                    result[i] = result[j];
                    result[j] = temporary;
                }
            }
            
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,7, 8, 90};
        System.out.println("sortDescendingOrder(arr) = " +Arrays.toString( sortDescendingOrder(arr)));
    }
}
