import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        double hesoA,hesoB,hesoC;
        System.out.println("Nhap he so A ");
        Scanner sc = new Scanner(System.in);
        hesoA = sc.nextDouble();
        System.out.println("Nhap he so B ");
        hesoB = sc.nextDouble();
        System.out.println("Nhap he so C ");
        hesoC = sc.nextDouble();
        if (hesoA == 0) {
            if (hesoB == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-hesoC / hesoB));
            }
            return;
        }
        double delta = hesoB*hesoB - 4*hesoA*hesoC;
        double x1;
        double x2;
        if (delta > 0) {
            x1 = (float) ((-hesoB + Math.sqrt(delta)) / (2*hesoA));
            x2 = (float) ((-hesoB - Math.sqrt(delta)) / (2*hesoA));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-hesoB / (2 * hesoA));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}