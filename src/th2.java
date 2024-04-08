import java.util.Scanner;

public class th2 {
    public static void  main(String[] args){
            System.out.println("gai pt");
            System.out.println("nhap so:");
            Scanner so = new Scanner(System.in);
            System.out.print("a: ");
            double a = so.nextDouble();

            System.out.print("b: ");
            double b = so.nextDouble();

            System.out.print("c: ");
            double c = so.nextDouble();
            if (a != 0) {
                double answer = (c - b) / a;
                System.out.printf("Equation pass with x = %f!\n", answer);
            } else {
                if (b == c) {
                    System.out.print("x!");
                } else {
                    System.out.print("vo nghiem !");
                }
            }
    }
}

