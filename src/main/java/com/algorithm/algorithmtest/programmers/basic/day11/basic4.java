package com.algorithm.algorithmtest.programmers.basic.day11;

import java.util.Arrays;

public class basic4 {
    public static int[] solution(int start, int end) {
        int[] answer = new int[start - end + 1];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = start - i;
        }
        return answer;
    }
    public static void main(String[] args) {
        int start = 10;
        int end = 3;
        System.out.println(Arrays.toString(solution(start, end)));
    }
}
