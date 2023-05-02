package com.algorithm.algorithmtest.programmers.basic.day16;

import java.lang.reflect.Array;
import java.util.Arrays;

public class basie3 {
    public static int[] solution(int start, int end) {
        int[] answer = new int[end - start + 1];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = start + i;
        }
        return answer;
    }
    public static void main(String[] args) {
        int start = 3;
        int end = 10;
        System.out.println(Arrays.toString(solution(start, end)));

    }
}
