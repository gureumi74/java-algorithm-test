package com.algorithm.algorithmtest.programmers.basic.day11;

public class basic5 {
    public static int solution(int[] arr, int idx) {
        for(int i = idx + 1; i < arr.length; i++) {
            if(arr[i] == 1) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1};
        int idx = 1;
        System.out.println(solution(arr, idx));
    }
}
