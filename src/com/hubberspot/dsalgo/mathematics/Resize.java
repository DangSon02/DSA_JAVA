package com.hubberspot.dsalgo.mathematics;

public class Resize {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static int[] resize(int arr[], int capacity) {

        if (capacity < arr.length) {
            throw new IllegalArgumentException("Invalid input ");
        }

        int[] temp = new int[capacity];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        arr = temp;

        return arr;
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        printArray(resize(numbers, 8));

    }

}
