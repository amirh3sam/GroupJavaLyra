package question15;

public class Array_Find_Max_Num {
    public static void main(String[] args) {
        int[] arr={-1,40,3,2,1,100};

        System.out.println(maxNum(arr));
        //Collections.max(Arrays.asList(maxNum(arr)));
    }




    public static int maxNum(int[] num ){
        int maxNumber= num[0];
        for (int each : num) {
            if(each>maxNumber){
                maxNumber=each;
            }

        }




        return maxNumber;
    }
}
