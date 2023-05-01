package com.algorithm.algorithmtest.programmers.basic.day14;

import java.util.Arrays;

public class Solution1 {
    public static int solution(int[] array, int n) {
        Arrays.sort(array);
        int answer = array[0];
        for(int i = 1; i < array.length; i++) {
            answer = Math.abs(n - array[i]) < Math.abs(n - answer) ? array[i] : answer;
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] array = {10, 20, 15};
        int n = 0;
        System.out.println(solution(array, n));
    }
}
