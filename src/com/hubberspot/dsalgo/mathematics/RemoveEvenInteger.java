package com.hubberspot.dsalgo.mathematics;

public class RemoveEvenInteger {

    public void printArray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        System.out.println();

    }

    public int[] removeEven(int arr[]) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }

        int[] result = new int[count];

        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0) {
                result[index] = arr[i];
                index++;
            }
        }

        return result;

    }

    public static void main(String[] args) {
        int[] array = { 3, 2, 4, 7, 10, 6, 5 };

        RemoveEvenInteger removeEvenInteger = new RemoveEvenInteger();

        int[] result = removeEvenInteger.removeEven(array);

        removeEvenInteger.printArray(result);

    }

}
