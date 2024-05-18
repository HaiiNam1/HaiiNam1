import java.util.ArrayList;
import java.util.Scanner;

public class list {
    public static void main(String[] args) {
        ArrayList<Integer> arrListInterger = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Nhap so luong phan tu trong danh sach: ");
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            number = scanner.nextInt();
            arrListInterger.add(number);
        }


        int max = arrListInterger.get(0);

        for (int i = 0; i < arrListInterger.size(); i++) {
            if (arrListInterger.get(i) > max) {
                max = arrListInterger.get(i);
            }
        }
        System.out.println("Phan tu lon nhat trong arrListInterger = " + max);
    } 

}