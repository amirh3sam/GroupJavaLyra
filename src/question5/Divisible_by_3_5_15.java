package question5;

public class Divisible_by_3_5_15 {
    public static void main(String[] args) {

        String nums15 = "",
                nums3 = "",
                nums5 = "";


        for (int i = 1; i < 100 ; i++) {
            if (i % 15 ==0 && i% 5 ==0 && i%3==0) {
                nums15 += i + " " ;
            }
            if (i % 15 !=0 && i%5==0 ) {
                nums5 += i + " " ;
            }

            if (i % 15 !=0 && i%3==0 ) {
                    nums3 += i + " " ;
            }

        }

        System.out.println("Divisible by 15 " + nums15);
        System.out.println("Divisible by 5 "+ nums5);
        System.out.println("Divisible by 3 "+ nums3);


    }
    /*
    Numbers -- Divisible 3,5,15

        write program that can print the numbers betwwen 1~100 that can be divisible by 3,5 and 15
        if the number can be divisible by 3,5 and 15 , then it should only be displayed in DivisibleBy15 section
        if the number can be divisible by 3 but cannot be divisible by 15 , then it should only be displayed in DivisibleBy3 section
        if the number can be divisible by 5 but cannot be divisible by 15 , then it should only be displayed in DivisibleBy5 section

        ex:
        OutPut:
        Divisible By 15 15 30 45 60 75 90
        Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
        Divisible By 3 3 6 9 12 18 21 24 27 33 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
     */
}
