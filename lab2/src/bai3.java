import java.util.Scanner;

public class bai3   {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap vao ten va nam sinh
        System.out.print("Nhap ten cua ban: ");
        String ten = scanner.nextLine();

        System.out.print("Nhap nam sinh cua ban: ");
        int namSinh = scanner.nextInt();

        // Tinh tuoi
        int tuoi = 2024 - namSinh;

        // Hien thi nhom tuoi
        if (tuoi < 16) {
            System.out.println("Ban " + ten + " o do tuoi vi thanh nien.");
        } else if (tuoi >= 16 && tuoi < 60) {
            System.out.println("Ban " + ten + " o do tuoi truong thanh.");
        } else {
            System.out.println("Ban " + ten + " da gia.");
        }
    }
}
