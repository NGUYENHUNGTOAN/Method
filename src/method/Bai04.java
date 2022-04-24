package method;

/**
 * Viết chương trình liệt kê các cập số có từ 5 đến 7 chữ số thỏa mãn
 * a. Là số nguyên tố
 * b. là số thuận nghịch
 * c. không chứa số 4
 */

public class Bai04 {
    public static void main(String[] args) {
        for (int i = 10000; i <= 9999999; i++)
            if (soNT(i) && thuanNghich(i) && khongChua4(i)) {
                System.out.println(i);
            }
    }

    public static boolean soNT(int n) {
        if (n < 10000) {
            return false;
        }
        int c = (int) Math.sqrt(n);
        for (int i = 2; i <= c; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean thuanNghich(int n) {
        int tn = n;
        int temp = 0;
        while (n > 0) {
            temp = temp * 10 + n % 10;
            n /= 10;
        }
        if (temp == tn) return true;
        return false;
    }
    public static boolean khongChua4(int n) {
        if (n < 10000) {
            return false;
        }
        int i, m;
        for (i = 100000; i <= 9999999; i++) {
            m = n % 10;
            n = n / 10;
            if (m == 4) {
                return false;
            }
        }
        return true;
    }
}