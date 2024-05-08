import java.util.Scanner;

public class slide30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap so nguyen n (n > 0)
        System.out.print("Nhap vao mot so nguyen (n > 0): ");
        int n = scanner.nextInt();

        // Kiem tra n co lon hon 0 khong
        if (n <= 0) {
            System.out.println("Vui long nhap so nguyen lon hon 0.");
            return;
        }

        // Tinh tong cac chu so cua n
        int tongChuSo = 0;
        int soDu;
        while (n > 0) {
            soDu = n % 10;  // Lay chu so cuoi cung
            tongChuSo += soDu;
            n /= 10;        // Loai bo chu so cuoi cung
        }

        // In ket qua
        System.out.println("Tong cac chu so cua so vua nhap la: " + tongChuSo);
    }
}
