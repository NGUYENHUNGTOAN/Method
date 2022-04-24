package method;
import java.util.Scanner;
public class Bai10 {
    public static void main(String[] args) {
        int n = nhapSo(" Nhap so n: ");
        int ketqua = tinhGiaiThua(n);
        System.out.println("ket qua: " + ketqua);
        System.out.println("------------------");
        int ketqua1 = tinhToan(n);
        System.out.println("ket qua: " + ketqua1);
        /**
         * Nhập số nguyên duong n và tính tổng:
         * !n = n*(n-1)*(n-2)*...*2*1
         */
    }
    static int nhapSo(String message) {
        System.out.print(message);
        return new Scanner(System.in).nextInt();
    }

    static long tinhToan(int n) {
        int giaithua = 1;
        for (int i = 1; i <= n; i++) {
            giaithua = giaithua * i;
        }
        return giaithua;
    }
    static long tinhGiaiThua ( int n){
        if (n == 0) {
            return 1;
        }
        return (n * tinhGiaiThua(n - 1));
    }
}