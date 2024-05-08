import java.util.Scanner;

public class bai5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Nhap so nguyen: ");
            int integerNumber = scanner.nextInt();

            sum += integerNumber;

            if (sum > 100) {
                System.out.println("Tong da vuot qua 100. Ket thuc chuong trinh.");
                break;
            }
        }

        System.out.println("Tong cua cac so da nhap la: " + sum);
        scanner.close();
    }
}
