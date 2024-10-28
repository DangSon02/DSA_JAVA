package com.hubberspot.dsalgo.mathematics;

/*    Bài 24: Nhập vào số tự nhiên n
 *      a. Số tự nhiên n có bao nhiêu chữ số
 *      b. Tìm chữ số đầu tiên của n
 *      c. Tìm chữ số cuối cùng của n
 *      d. Tính tổng các chữ số của n
 *      e. Tìm số đảo ngược của n
 * 
 */

public class Exercise_24 {

    public static int FindSize(int n) {

        int count = 0;

        while (n > 0) {

            n = n / 10;

            count++;

        }

        return count;

    }

    public static int FistNumber(int n) {

        int temp = n;

        while (temp >= 10) {

            temp = temp / 10;

        }

        return temp;

    }

    public static int lastNumber(int n) {

        return n % 10;

    }

    public static int sumNumber(int n) {

        int sum = 0;
        int temp = 0;
        while (n > 0) {

            temp = n % 10;
            sum = sum + temp;

            n = n / 10;

        }

        return sum;
    }

    public static int reverseNumbers(int n) {

        int reverse = 0;

        while (n > 0) {

            int lastNumber = n % 10;

            reverse = reverse * 10 + lastNumber;

            n = n / 10;

        }

        return reverse;
    }

    public static void main(String[] args) {

        int n = 4321013;

        System.out.println(n + " co " + FindSize(n));
        System.out.println("Chu so dau tien la: " + FistNumber(n));
        System.out.println("Chu so cuoi la: " + lastNumber(n));
        System.out.println("Tong cac chu so: " + sumNumber(n));
        System.out.println("So dao nguoc la: " + reverseNumbers(n));

    }

}
