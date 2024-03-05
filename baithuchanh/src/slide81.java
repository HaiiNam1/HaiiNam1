import java.util.Scanner;

public class slide81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so hang cua ma tran: ");
        int hang = scanner.nextInt();
        System.out.print("Nhap so cot cua ma tran: ");
        int cot = scanner.nextInt();

        int[][] maTran = new int[hang][cot];

        // Nhap gia tri cho ma tran
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print("Nhap phan tu o hang " + (i + 1) + ", cot " + (j + 1) + ": ");
                maTran[i][j] = scanner.nextInt();
            }
        }

        // Tim gia tri lon nhat trong ma tran
        int max = maTran[0][0];
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                if (maTran[i][j] > max) {
                    max = maTran[i][j];
                }
            }
        }

        // Hien thi ma tran va phan tu co gia tri lon nhat
        System.out.println("Ma tran vua nhap:");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(maTran[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Phan tu co gia tri lon nhat trong ma tran la: " + max);
    }
}
