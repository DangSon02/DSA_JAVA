package com.hubberspot.dsalgo.mathematics;

public class FindMissingNumberArray {

    // public static int sumNumber(int n) {
    // return n * (n + 1) / 2;
    // }

    // public static int missingNumberArray(int arr[]) {

    // int max = Integer.MIN_VALUE;
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] > max) {
    // max = arr[i];
    // }
    // }

    // int missingNumber = sumNumber(max);

    // for (int i = 0; i < arr.length; i++) {
    // missingNumber = missingNumber - arr[i];
    // }

    // return missingNumber;
    // }

    public static int missingNumberArray(int arr[]) {

        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;

        for (int i = 0; i < arr.length; i++) {
            sum = sum - arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] numbers = { 2, 4, 1, 8, 6, 3, 7 };

        System.out.print("Missing numbers is::" + missingNumberArray(numbers));

    }

}
