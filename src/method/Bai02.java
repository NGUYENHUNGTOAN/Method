package method;
/**
 Viết chương trình liệt kê
 các cặp số nguyên tố cùng nhau trong đoạn a và b
*/
import java.util.Scanner;
public class Bai02 {
    public static void main(String[] args) {
        int a = nhapSo(" Nhap So a: ");
        int b = nhapSo(" Nhap So b: ");
        capSoNTcungNhau(a, b);
    }

    public static int nhapSo(String message) {
        System.out.print(message);
        return new Scanner(System.in).nextInt();
    }

    public static void capSoNTcungNhau(int a, int b) {
        for (int i = a; i < b; i++) {
            for (int j = a + 1; j <= b; j++) {
                if (ucln(i, j) == 1) {
                    System.out.println("Hai so (" + i + " , " + j + ") la NT cung nhau");
                }
            }
        }
    }
    public static int ucln(int a, int b) {
        int ucln = 1;
        int diemCuoi = a;
        if (a > b) {
            diemCuoi = b;
        }
        for (int i = 2; i <= diemCuoi; i++) {
            if (a % i == 0 && b % i == 0 && i > ucln) {
                ucln = i;
            }
        }
        return ucln;
    }
}
