package com.algorithm.algorithmtest.bakingdog.x03;

public class ArrayExam2 {
    public static void main(String[] args) {
        int[] arr = {4, 13, 63, 87};
        int N = 4;
        System.out.println(func2Solution2(arr, N));
    }
    public static int func2(int[] arr, int N) {
        for(int i = 0; i < N - 1; i++) {
            for(int j = i + 1; j < N; j++) {
                if(arr[i] + arr[j] == 100) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static int func2Solution2(int[] arr, int N) {
        int[] numbers = new int[100];
        for(int i = 0; i < arr.length; i++) {
            if(numbers[100 - arr[i]] == 1) return 1;
            else numbers[arr[i]] = 1;
        }

        return 0;
    }
}
