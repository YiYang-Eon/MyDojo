package com.echo.mashibing.suanfa.sort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 2, 4, 99, 7, 9, 3, 1, 6, 11, 3, 45};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        for (int end = 1; end < N; end++) {
            int newIndex = end;
            while (newIndex - 1 >= 0 && arr[newIndex - 1] > arr[newIndex]) {
                swap(arr, newIndex - 1, newIndex);
                newIndex--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
