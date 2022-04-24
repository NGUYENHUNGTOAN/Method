package method;
/**
 * Viết chương trình liệt kê các số nguyên tố có từ 5 đến 7 chữ số thỏa mãn
 * a. là số thuận nghịch
 * b. chỉ có chữ số 0, 6, 8
 * c. tổng các chữ số chia hết cho 10
 */

public class Bai06 {

    public static void main(String[] args) {
        for (int i = 1000000; i <= 999999999; i++)
            if (chiCoSo068(i) && thuanNghich(i) && tongChiaHet10(i)) {
                System.out.println(i);
            }
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
    public static boolean chiCoSo068(int n) {
        while (n > 0) {
            int soDu = n % 10;
            if (soDu != 0 && soDu != 6 && soDu != 8) {
                return false;
            }
            n /= 10;
        }
        return true;
    }
    public static boolean tongChiaHet10(int n) {
        int tong = 0;
        while (n > 0) {
            int t = n % 10;
            tong = tong + t;
            n = n / 10;
        }
        if (tong % 10 == 0)
            return true;
        return false;
    }
}