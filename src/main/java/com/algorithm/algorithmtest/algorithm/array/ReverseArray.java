package com.algorithm.algorithmtest.algorithm.array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    static void swap(int[] a, int idx1, int idx2) {
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }
    static void reverse(int[] a) {
        for(int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - 1 - i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("역순으로 바꾸기 전");
        System.out.println(Arrays.toString(num));
        reverse(num);
        System.out.println("요소를 역순으로 정렬");
        System.out.println(Arrays.toString(num));

    }
}
