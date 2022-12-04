package com.echo.mashibing.suanfa.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 2, 4, 99, 7, 9, 3, 1, 6, 11, 3, 45};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        int N = arr.length;
        for (int end = N - 1; end >= 0; end--) {
            for (int second = 1; second <= end; second++) {
                if (arr[second - 1] > arr[second]) {
                    swap(arr, second - 1, second);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}

