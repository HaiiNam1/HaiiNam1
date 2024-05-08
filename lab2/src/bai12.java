import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap so hang va so cot cua ma tran
        System.out.print("Nhap so hang cua ma tran: ");
        int hang = scanner.nextInt();
        System.out.print("Nhap so cot cua ma tran: ");
        int cot = scanner.nextInt();

        // Khoi tao ma tran
        int[][] maTran = new int[hang][cot];

        // Nhap gia tri cho tung phan tu cua ma tran
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print("Nhap phan tu o hang " + (i + 1) + ", cot " + (j + 1) + ": ");
                maTran[i][j] = scanner.nextInt();
            }
        }

        // Tim phan tu co gia tri lon nhat trong ma tran
        int max = timPhanTuLonNhat(maTran);

        // Hien thi ma tran va phan tu co gia tri lon nhat
        System.out.println("Ma tran vua nhap:");
        hienThiMaTran(maTran);

        System.out.println("Phan tu co gia tri lon nhat trong ma tran la: " + max);
    }

    // Ham tim phan tu lon nhat trong ma tran
    public static int timPhanTuLonNhat(int[][] arr) {
        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        return max;
    }

    // Ham hien thi ma tran
    public static void hienThiMaTran(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
