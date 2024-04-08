import java.util.Scanner;

public class th3namnhuan {
    public static void main(String[] args) {
       Scanner so = new Scanner(System.in);
        int year;

         System.out.println("mhap so : ");
        year = so.nextInt();
        boolean isLeapYear = false;


        boolean isDivisibleBy4 = year % 4 == 0;
        if(isDivisibleBy4){

            boolean isDivisibleBy100 = year % 100 == 0;
            if(isDivisibleBy100){

                boolean isDivisibleBy400 = year % 400 == 0;
                if(isDivisibleBy400){
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if(isLeapYear){
            System.out.printf("la nam nhuanr", year);
        } else {
            System.out.printf("khong phai nam nhuan", year);
        }
    }
}

