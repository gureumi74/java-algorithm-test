package com.algorithm.algorithmtest.programmers.basic.day23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution2 {
    public static int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        float[] average = new float[score.length];
        List<Float> list = new ArrayList<>();
        for(int i = 0; i < score.length; i++) {
            average[i] = (float) (score[i][0] + score[i][1]) / 2;
            list.add(average[i]);
        }

        Collections.sort(list, Collections.reverseOrder());

        for(int i = 0; i < score.length; i++) {
            answer[i] = list.indexOf(average[i]) + 1;
        }

        return answer;
    }
    public static void main(String[] args) {
        int[][] score = {{1, 3}, {3, 1}, {2, 3}, {3, 2}, {1, 2}, {0, 0}};
        System.out.println(Arrays.toString(solution(score)));
    }
}
