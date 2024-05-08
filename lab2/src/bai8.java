import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap so luong phan tu cua day so
        System.out.print("Nhap so luong phan tu cua day so: ");
        int n = scanner.nextInt();

        // Khoi tao mang de luu day so
        int[] daySo = new int[n];

        // Nhap gia tri cho tung phan tu cua day so
        System.out.println("Nhap gia tri cho tung phan tu cua day so:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            daySo[i] = scanner.nextInt();
        }

        // Tinh gia tri trung binh cua day so
        double trungBinh = tinhTrungBinh(daySo);

        // Hien thi ket qua
        System.out.println("Gia tri trung binh cua day so la: " + trungBinh);
    }

    // Ham tinh gia tri trung binh
    public static double tinhTrungBinh(int[] mang) {
        int tong = 0;

        for (int so : mang) {
            tong += so;
        }

        if (mang.length > 0) {
            return (double) tong / mang.length;
        } else {
            return 0;
        }
    }
}
