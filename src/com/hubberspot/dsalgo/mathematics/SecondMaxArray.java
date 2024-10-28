package com.hubberspot.dsalgo.mathematics;

public class SecondMaxArray {

    // public static int findSecondMax(int arr[]) {

    // int max = Integer.MIN_VALUE;

    // int secondMax = Integer.MIN_VALUE;

    // for (int i = 1; i < arr.length; i++) {
    // if (arr[i] >= max) {

    // max = arr[i];
    // }

    // }

    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] > secondMax && arr[i] < max) {
    // secondMax = arr[i];
    // }
    // }

    // return secondMax;
    // }

    public static int findSecondMax(int arr[]) {

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        return secondMax;
    }

    public static void main(String[] args) {

        int[] numbers = { 13, 34, 2, 34, 33, 1 };

        System.out.println("Second max::" + findSecondMax(numbers));

    }

}
