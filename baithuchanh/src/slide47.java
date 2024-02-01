import java.util.Scanner;

public class trang47 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tong = 0;
        int so;

        while (true) {
            System.out.print("Nhap so nguyen (nhap 0 de ket thuc): ");
            so = scanner.nextInt();

            // Thoat khoi vong lap neu nguoi dung nhap 0 hoac tong lon hon 100
            if (so == 0 || tong > 100) {
                break;
            }

            // Cong so vao tong
            tong += so;
        }

        // Hien thi tong
        System.out.println("Tong cua cac so da nhap la: " + tong);
    }
}
