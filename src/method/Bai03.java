package method;
/**
 *  Viết chương trình nhập vào số nguyên duong n và thực hiện các chức năng sau:
 * 1. Đếm xem n có bao nhiêu chữ số lẻ và bao nhiêu chữ số chẵn.
 * 2. Kiểm tra xem các chữ số của n có được sắp xếp theo thứ tự
 * tăng dần hoặc giảm dần hay không.
 */

import java.util.Scanner;
public class Bai03 {
    public static void main(String[] args) {
        int n = nhapSo();
        chanLe(n);
        kiemTra(n);
    }

    public static int nhapSo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Xin mời nhập số: ");
        int x = input.nextInt();
        return x;
    }

    public static void chanLe(int n) {
        int i;
        int j = 0;
        int chan = 0;
        int le = 0;
        while (n > 0) {
            i = n % 10;
            n = n / 10;
            j++;
            if (i % 2 == 0)
                chan++;
            else
                le++;
        }
        System.out.print(" Số lẻ: " + le);
        System.out.println(" Số chẵn: "  + chan);
    }

    public static void kiemTra(int n) {
        int i = n % 10, ss, kt1 = 0, kt2 = 0;
        n = n / 10;
        while (n != 0) {
            ss = n % 10;
            if (i < ss) kt1 = 1;
            if (i > ss) kt2 = 1;
            i = ss;
            n = n / 10;
        }
        if (kt1 == 0 && kt2 == 1) {
            System.out.println("Là số tăng dần");
        }
        if (kt2 == 0 && kt1 == 1) {
            System.out.println("Là số giảm dần");
        }
        if (kt1 == 1 && kt2 == 1 || kt1 == 0 && kt2 == 0) {
            System.out.println("Là số không tăng không giảm");
        }
    }
}

