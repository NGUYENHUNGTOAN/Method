package method;
public class Bai07 {
    /**
     * Viết chương trình liệt kê các số nguyên có 7 chữ số thỏa mãn
     * a. là số nguyên tố
     * b. tất cả các chữ số là số nguyên tố
     * c. đảo của nó cũng là một số nguyên tố
     */
    public static void main(String[] args) {
        for (int i = 1000000; i <= 9999999; i++)
            if (soNT(i) && chuSoCungLaNT(i) && checkDao(i)) {
                System.out.println(i);
            }
    }

    public static boolean soNT(int n) {
        if (n < 2) {
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
    public static boolean chuSoCungLaNT(int n) {
        while (n>0){
            int soDu = n % 10;
            if (!soNT(soDu)){
                return false;
            }
            n = n/10;
        }
        return true;
    }
    public static int soDaoNguoc(int n) {
        int ketQua = 0;
        while (n > 0) {
            int soDu = n % 10;
            ketQua = ketQua * 10 + soDu;
            n /= 10;
        }
        return ketQua;
    }
    static boolean checkDao(int n){
        int soDao = soDaoNguoc(n);
        return soNT(soDao);
    }
}

