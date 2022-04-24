package method;

import java.util.Scanner;

public class Bai09 {
    public static void main(String[] args) {
        int n = nhapSo("Xin moi nhap so n: ");
        int ketqua = fibonacci(n);
        System.out.println("ket qua la: " +ketqua);
        /**
         * Fibonacci
         * F0 = 1, F1 = 1, Fn = F(n-1) + F(n-2)
         * F2 = 2, F3 = 3, F4 = 5, F5 = 8.
         */
    }
    static int nhapSo(String message){
        System.out.println(message);
        return new Scanner(System.in).nextInt();
    }
    static int fibonacci(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
