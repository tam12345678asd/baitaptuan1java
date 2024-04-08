import java.util.Scanner;

public class tht1s {
   public static void main(String[]args){
       float width;
       float height;
       Scanner hinh = new Scanner(System.in);
       System.out.println("nhap chieu rong");
       width = hinh.nextFloat();
       System.out.println("nhap chieu dai");
       height = hinh.nextFloat();
       float dientich = width * height;
       System.out.println("dien tich la:" + dientich);

   }



}
