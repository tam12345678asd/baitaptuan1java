import java.util.Scanner;

public class b3 {
    public static void main(String[] args) {
        Scanner infor = new Scanner(System.in);
        System.out.println("nhap diem kiem tra cua ban:");
        double input1 = infor.nextDouble();
        System.out.println("nhap diem chuyen can cua ban:");
        double input2 = infor.nextDouble();
        System.out.println("nhap diem thi hoc ki cua ban:");
        double input = infor.nextDouble();
        double tbm = (input+input1+input2)/3;
        if (tbm >= 8.5) {
            System.out.println("ban xep loai A");
        }
        if (tbm >= 7 && tbm < 8.5 ) {
            System.out.println("ban xep loai B");

        }
        if (tbm >= 5.5 && tbm < 7) {
            System.out.println("ban xep loai C");

        }
        if (tbm >= 4 && tbm < 5.5) {
            System.out.println("ban xep loai D");
        }
        if (tbm < 4) {
            System.out.println("ban xep loai F");
        }
    }
}
