package method;
/**
 * Viết chương trình liệt kê các số thuận nghịch
 * có 6 chữ số mà tổng các chữ số chia hế cho 10.
 */
public class Bai01 {
    public static void main(String[] args) {
        ketQua();
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
    public static void ketQua() {
        int count = 0;
        for (int i = 100000; i <= 999999; i++) {
            if (thuanNghich(i) && tongChiaHet10(i)) {
                if (count % 10 == 0)
                    System.out.println("");
                count++;
                System.out.print(" " + i);
            }
        }
    }
}
