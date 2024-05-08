import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap chuoi tu ban phim
        System.out.print("Nhap chuoi: ");
        String chuoi = scanner.nextLine();

        // Dem so ky tu thuong, ky tu hoa va so
        int soKyTuThuong = 0;
        int soKyTuHoa = 0;
        int soChuSo = 0;

        for (char kyTu : chuoi.toCharArray()) {
            if (Character.isLowerCase(kyTu)) {
                soKyTuThuong++;
            } else if (Character.isUpperCase(kyTu)) {
                soKyTuHoa++;
            } else if (Character.isDigit(kyTu)) {
                soChuSo++;
            }
        }

        // Hien thi ket qua
        System.out.println("So ky tu thuong trong chuoi: " + soKyTuThuong);
        System.out.println("So ky tu hoa trong chuoi: " + soKyTuHoa);
        System.out.println("So chu so trong chuoi: " + soChuSo);
    }
}
