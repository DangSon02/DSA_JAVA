package com.hubberspot.dsalgo.mathematics;

public class MoveZeros {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    // cách này dịch chuyển số 0 làm thay đổi thứ tự các phần phần tử trong mảng
    // public static int[] moveZeros(int arr[]) {

    // int i = 0;
    // int j = arr.length - 1;
    // int temp = 0;

    // while (i < j && arr[j] != 0) {
    // if (arr[i] == 0) {
    // temp = arr[i];
    // arr[i] = arr[j];
    // arr[j] = temp;
    // j--;
    // }
    // i++;
    // }

    // return arr;
    // }

    // cách này dịch chuyển số 0 mà không làm thay đổi thứ tự các phần phần tử trong
    // mảng

    public static int[] moveZeros(int arr[], int n) {

        int j = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }

            if (arr[i] != 0) {
                j++;
            }

        }

        return arr;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 4, 5 };

        printArray(moveZeros(arr, arr.length));

    }

}
