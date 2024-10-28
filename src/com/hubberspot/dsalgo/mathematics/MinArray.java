package com.hubberspot.dsalgo.mathematics;

public class MinArray {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static int minNumber(int arr[]) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        return min;

    }

    public static void main(String[] args) {

        int[] numbers = { 3, 7, 22, 5, 4, 10 };

        System.out.println("Min::" + minNumber(numbers));

    }

}
