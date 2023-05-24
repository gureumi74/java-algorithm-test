package com.algorithm.algorithmtest.programmers.basic.day11;

import java.util.Arrays;

public class basic2 {
    public static int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        for(int i = 0; i < n / k; i++) {
            answer[i] = (i + 1) * 3;
        }
        return answer;
    }
    public static void main(String[] args) {
        int n = 10;
        int k = 3;
        System.out.println(Arrays.toString(solution(n, k)));
    }
}
