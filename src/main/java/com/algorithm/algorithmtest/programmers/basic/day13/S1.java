package com.algorithm.algorithmtest.programmers.basic.day13;

import java.util.Arrays;

public class S1 {
    public static int[] solution(int[] num_list, int n) {
        int[] answer = Arrays.copyOfRange(num_list, n - 1, num_list.length);

        return answer;
    }
    public static void main(String[] args) {
        int[] num_list = {2, 1, 6};
        int n = 3;
        System.out.println(Arrays.toString(solution(num_list, n)));
    }
}
