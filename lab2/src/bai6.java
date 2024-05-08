import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap so nguyen duong tu ban phim
        System.out.print("Nhap mot so nguyen duong: ");
        int soNguyenDuong = scanner.nextInt();

        // Kiem tra neu so nhap vao khong phai la so nguyen duong
        while (soNguyenDuong <= 0) {
            System.out.print("Nhap lai mot so nguyen duong: ");
            soNguyenDuong = scanner.nextInt();
        }

        // Tinh giai thua cua so nguyen duong
        long giaiThua = tinhGiaiThua(soNguyenDuong);

        // Hien thi ket qua
        System.out.println("Giai thua cua " + soNguyenDuong + " la: " + giaiThua);
    }

    // Ham tinh giai thua
    public static long tinhGiaiThua(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * tinhGiaiThua(n - 1);
        }
    }
}
