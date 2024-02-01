import java.util.Scanner;

public class trang40 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap vao mot so ngay (1-7)
        System.out.print("Nhap vao mot so ngay (1-7): ");
        int soNgay = scanner.nextInt();

        // Kiem tra xem so ngay co nam trong khoang hop le khong
        if (soNgay < 1 || soNgay > 7) {
            System.out.println("Vui long nhap mot so tu 1 den 7.");
            return;
        }

        // Hien thi ngay tuong ung trong tuan
        switch (soNgay) {
            case 1:
                System.out.println("Ngay thu Hai");
                break;
            case 2:
                System.out.println("Ngay thu Ba");
                break;
            case 3:
                System.out.println("Ngay thu Tu");
                break;
            case 4:
                System.out.println("Ngay thu Nam");
                break;
            case 5:
                System.out.println("Ngay thu Sau");
                break;
            case 6:
                System.out.println("Ngay thu Bay");
                break;
            case 7:
                System.out.println("Ngay Chu Nhat");
                break;
        }
    }
}
