import java.util.Scanner;

public class luyentap {
    public static void main(String[] args) {
        int so;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so: ");
        so = scanner.nextInt();
        if(so > 0){
            System.out.println("so nguyen duong");
        }
        else{
            System.out.println("so nguyen am");
        }
        scanner.close();
    }
}