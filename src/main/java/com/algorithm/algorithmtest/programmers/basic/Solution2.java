package com.algorithm.algorithmtest.programmers.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution2 {
    public static int solution(int k, int m, int[] score) {
        int answer = 0;
        if(score.length < m) {
            return 0;
        }
        Arrays.sort(score);
        int idx = score.length - m;
        for(int i = 1; i <= score.length / m; i++) {
            answer += score[idx] * m;
            idx -= m;
            if (idx < 0) {
                break;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int k = 3;
        int m = 4;
        int[] score = {1, 2, 3, 1, 2, 3, 1};
        System.out.println(solution(k, m, score));

    }
}
