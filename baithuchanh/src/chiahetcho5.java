import java.util.Scanner;

public class chiahetcho5 {

    public static void main(String[] args) {
        System.out.println("Cac so chia het cho 5 trong pham vi tu 0 den 20:");

        for (int i = 0; i <= 20; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
