package method;

/**
 *  Viết chương trình liệt kê các số nguyên có 7 chữ số thỏa mãn
 *  a. là số nguyên tố
 *  b. tổng các chữ số của nó là một số nguyên tố
 *  c. các chữ số từ trái qua phải tạo thành một dãy không giảm
 */
public class Bai05 {
    public static void main(String[] args) {
        for (int i = 1000000; i <= 9999999; i++)
            if (tongChuSoLaNT (i) % i !=0 && soNT (i) && khongGiam (i)) {
                System.out.println(i);
            }
    }
    public static boolean soNT(int n) {
        if (n < 1000000) {
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
    public static int tongChuSoLaNT(int n) {
        int tong = 0;
        while (n > 0) {
            int soDu = n % 10;
            tong = tong + soDu;
            n = n / 10;
        }
        return tong;
    }
    public static boolean khongGiam(int n) {
        int i = n % 10, j, k1 = 0, k2 = 0;
        n = n / 10;
        while (n != 0) {
            j = n % 10;
            if (i < j) k1 = 1;
            if (i > j) k2 = 1;
            i = j;
            n = n / 10;
        }
        if (k1 == 1 && k2 == 1 || k1 == 0 && k2 == 0 ||k1 == 0 && k2 == 1) {
            return true;
        }
        return false;
    }
}
