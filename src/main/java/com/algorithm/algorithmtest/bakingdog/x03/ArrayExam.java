package com.algorithm.algorithmtest.bakingdog.x03;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayExam {
    static int len = 6;
    public static void main(String[] args) {
        int[] arr = {10, 50, 40, 30, 70, 20, 0, 0, 0, 0};
        System.out.println(Arrays.toString(insert(3, 60, arr)));
        System.out.println(len);
        System.out.println(Arrays.toString(erase(4, arr)));
        System.out.println(len);

    }
    public static int[] insert(int idx, int num, int arr[]) {
        len++;
        for(int i = len; i > idx; i--) {
            arr[i] = arr[i - 1];
        }
        arr[idx] = num;

        return arr;
    }
    public static int[] erase(int idx, int arr[]) {
        for(int i = idx; i < len; i++) {
            arr[i] = arr[i + 1];
        }
        len--;

        return arr;
    }
}
