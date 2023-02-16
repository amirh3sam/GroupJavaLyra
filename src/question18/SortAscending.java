package question18;

public class SortAscending {
    public static void main(String[] args) {


        int[] arr = {10, 9, 8, 7};
        int temp= 0;

        System.out.println("Elements of original array"); // printing original array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr [i]>arr[j]){
                    temp=arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                }
            }
        }

        System.out.println();
        System.out.println("Elements of sorted array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}


/*

Question2: Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
 arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */