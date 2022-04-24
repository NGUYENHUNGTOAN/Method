package method;
/**
 * Nhập số nguyên duong n và tính tổng:
 * S = 1+1.2+...+1.2.3.n
 */

import java.util.Scanner;
public class Bai08 {
    public static void main(String[] args) {
        int n = nhapSo(" Nhap so n: ");
        int ketqua = tinhTongThongThuong(n);
        System.out.println("ket qua: " +ketqua);
        System.out.println("------------------");
        int ketqua1 = tinhTongDeQuy(n);
        System.out.println("ket qua: " +ketqua1);
    }
    static int nhapSo(String message) {
        System.out.print(message);
        return new Scanner(System.in).nextInt();
    }
    static int tinhTongThongThuong(int n){
        int tong = 0;
        int giaithua = 1;
        for (int i=1; i<=n; i++){
            giaithua = giaithua * i;
            tong = tong + giaithua;
        }
        return tong;
    }
    static int tinhTongDeQuy (int n){
        if (n==1){
            return 1;
        }
        return tinhGiaiThua(n) + tinhTongDeQuy(n-1);
    }
    static int tinhGiaiThua(int n){
        int giaiThua;
        if (n == 1) {
            return (1);
        }
        return giaiThua = n * tinhGiaiThua(n - 1);
    }
}
