package question3;

public class question3 {
    public static void main(String[] args) {

        FINRA();


    }
    public static void FINRA(){
        for (int i = 1; i <= 30; i++) {
            if (i%3==0 && i%5==0){ // if numbers are multiple of 3 and 5
                System.out.print("FINRA ");
            }else if (i%3==0){ // if numbers are multiple of 3
                System.out.print("FIN ");
            } else if (i%5==0) { // if numbers are multiple of 5
                System.out.print("RA ");
            }else {
                System.out.print(i+" ");

            }
        }
    }
}
