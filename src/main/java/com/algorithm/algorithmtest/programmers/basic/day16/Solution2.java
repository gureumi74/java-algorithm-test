package com.algorithm.algorithmtest.programmers.basic.day16;

import java.util.Arrays;

public class Solution2 {
    public static int[] solution(int[] array) {
        int[] answer = new int[2];
        for(int i = 0; i < array.length; i++) {
            if (answer[0] < array[i]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] array = {1, 8, 3};
        System.out.println(Arrays.toString(solution(array)));

    }
}
