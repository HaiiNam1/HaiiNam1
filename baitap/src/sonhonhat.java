import java.util.Scanner;

public class sonhonhat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap vao hai so
        System.out.print("Nhap so thu nhat: ");
        double so1 = scanner.nextDouble();

        System.out.print("Nhap so thu hai: ");
        double so2 = scanner.nextDouble();

        // Tim so nho nhat
        double soNhoNhat = Math.min(so1, so2);

        // In ket qua
        System.out.println("So nho nhat trong hai so la: " + soNhoNhat);
    }
}
