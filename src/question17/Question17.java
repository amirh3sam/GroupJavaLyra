package question17;

public class Question17 {
    public static void main(String[] args) {
        int[] arr={-1,40,3,2,1,-100};

        System.out.println(minNum(arr));
        //Collections.max(Arrays.asList(minNum(arr)));
    }




    public static int minNum(int[] num ){
        int minNumber= num[0];
        for (int each : num) {
            if(each<minNumber){
                minNumber=each;
            }

        }




        return minNumber;
    }
}


