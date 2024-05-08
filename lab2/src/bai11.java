import java.util.Scanner;
import java.util.Arrays;

public class bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap so luong phan tu cua mang
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();

        // Khoi tao mang A co n phan tu
        int[] A = new int[n];

        // Nhap gia tri cho tung phan tu cua mang A
        System.out.println("Nhap gia tri cho tung phan tu cua mang A:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }

        // Sap xep mang A theo thu tu tang dan
        Arrays.sort(A);

        // Hien thi mang so ban dau
        System.out.println("Mang so ban dau:");
        hienThiMang(A);

        // Hien thi mang da sap xep theo thu tu tang dan
        System.out.println("Mang da sap xep theo thu tu tang dan:");
        hienThiMang(A);
    }

    // Ham hien thi mang
    public static void hienThiMang(int[] mang) {
        for (int i = 0; i < mang.length; i++) {
            System.out.print(mang[i] + " ");
        }
        System.out.println();
    }
}
