package question4;

public class SwapVariables_noThirdVariable {
    public static void main(String[] args) {

        //swap two variables without using a third variable

        int a = 10;
        int b = 20;

        System.out.println("Before swap: " + a +" "+ b);

        a = a+b;
        b = a-b;
        a= a-b;

        System.out.println("Swapped variables: "+ a + " "+ b);











    }
}
