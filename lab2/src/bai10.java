import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi không quá 80 ký tự
        System.out.print("Nhập chuỗi không quá 80 ký tự: ");
        String chuoi = scanner.nextLine();

        while (chuoi.length() > 80) {
            System.out.print("Nhập lại chuỗi không quá 80 ký tự: ");
            chuoi = scanner.nextLine();
        }

        // Nhập ký tự cần đếm
        System.out.print("Nhập một ký tự: ");
        char kyTuCanDem = scanner.next().charAt(0);

        // Đếm số lần xuất hiện của ký tự trong chuỗi
        int soLanXuatHien = demSoLanXuatHien(chuoi, kyTuCanDem);

        // Hiển thị kết quả
        System.out.println("Số lần xuất hiện của ký tự '" + kyTuCanDem + "' trong chuỗi là: " + soLanXuatHien);
    }

    // Hàm đếm số lần xuất hiện của ký tự trong chuỗi
    public static int demSoLanXuatHien(String chuoi, char kyTu) {
        int count = 0;

        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kyTu) {
                count++;
            }
        }

        return count;
    }
}
