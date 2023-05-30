package com.algorithm.algorithmtest.programmers.basic.day25;

import java.util.Arrays;

public class Solution3 {
    public static int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = (total / num) - ((num - 1) / 2);
        for(int i = 0; i < num; i++) {
            answer[i] = start + i;
        }
        return answer;
    }
    public static void main(String[] args) {
        int num = 3;
        int total = 0;
        System.out.println(Arrays.toString(solution(num, total)));
    }
}
