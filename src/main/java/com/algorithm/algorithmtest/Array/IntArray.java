package com.algorithm.algorithmtest.Array;

public class IntArray {
    public static void main(String[] args) {
        int[] arr = new int[5]; // 배열의 선언
        arr[1] = 37;
        arr[2] = 51;
        arr[4] = arr[1] * 2;

        for(int i = 0; i < 5; i++) {
            System.out.println("a[" + i + "] = " + arr[i]);
        }
    }
}
