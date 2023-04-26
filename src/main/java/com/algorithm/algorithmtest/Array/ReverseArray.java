package com.algorithm.algorithmtest.Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    static void swap(int[] arr, int idx1, int idx2) {
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }

    static void reverse(int[] arr) {
        for(int i = 0; i < arr.length / 2; i++) {
            swap(arr, i, arr.length - i - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요솟수 : ");
        int num = sc.nextInt();

        int[] arr = new int[num];

        for(int i = 0; i < num; i++) {
            System.out.printf("arr[%d] : ", i);
            arr[i] = sc.nextInt();
        }

        reverse(arr);

        System.out.println("요소를 역순으로 정렬했습니다.");
        System.out.println(Arrays.toString(arr));
    }
}
