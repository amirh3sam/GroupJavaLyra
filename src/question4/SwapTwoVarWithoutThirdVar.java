package question4;

public class SwapTwoVarWithoutThirdVar {

    public static void main(String[] args) {

        int a = 100, b = 200;

        System.out.println("Before swap: " + a + " " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swap : " + a + " " + b);


    }
}

    /*

    Swap two variable values without using a third variable


     */