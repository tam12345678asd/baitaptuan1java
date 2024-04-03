import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
    double vnd = 23000;
    double usd;
    Scanner infor = new Scanner(System.in);
        System.out.println("NHAP SO TIEN USD CAN CHUYEN DOI:");
        int input = infor.nextInt();
        int total = input*23000;
        System.out.println(total + "vnd");
    }
}
