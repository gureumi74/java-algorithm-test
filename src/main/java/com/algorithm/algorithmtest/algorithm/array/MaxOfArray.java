package com.algorithm.algorithmtest.algorithm.array;

import java.util.Scanner;

public class MaxOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        for(int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }
        System.out.printf("최댓값은 %d입니다.", maxOf(input));

    }
    static int maxOf(int[] a) {
        int max = a[0];

        for(int i = 1; i < a.length; i++) {
            if(max < a[i]) max = a[i];
        }

        return max;
    }
}
