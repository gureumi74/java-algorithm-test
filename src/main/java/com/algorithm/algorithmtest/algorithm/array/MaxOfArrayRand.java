package com.algorithm.algorithmtest.algorithm.array;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
    static int maxOf(int[] a) {
        int max = a[0];
        for(int i = 1; i < a.length; i++) {
            if(max < a[i]) max = a[i];
        }

        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++) {
            num[i] = 100 + rand.nextInt(90);
            System.out.println("num[i] = " + num[i]);
        }

        System.out.printf("최댓값은 %d 입니다.\n", maxOf(num));
    }
}
