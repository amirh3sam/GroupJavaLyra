package question4;

public class SwapTwoNumberWithoutThirdVar {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Before swap: "+ a + " " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swap: "+ a + " " + b);


    }
}

    /*

    Swap two variable values without using a third variable


     */