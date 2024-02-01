import java.util.Scanner;

public class trang90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap chuoi tu ban phim
        System.out.print("Nhap chuoi: ");
        String chuoi = scanner.nextLine();

        // Hien thi cac ky tu tren tung dong
        System.out.println("Cac ky tu trong chuoi la:");
        for (int i = 0; i < chuoi.length(); i++) {
            char kyTu = chuoi.charAt(i);
            System.out.println(kyTu);
        }
    }
}
