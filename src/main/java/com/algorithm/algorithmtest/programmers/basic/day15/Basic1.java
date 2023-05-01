package com.algorithm.algorithmtest.programmers.basic.day15;

import java.util.Arrays;

public class Basic1 {
    public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        System.arraycopy(num_list, 0, answer, 0, num_list.length);
        answer[num_list.length] = answer[num_list.length - 1] > answer[num_list.length - 2] ?
                answer[num_list.length - 1] - answer[num_list.length - 2] : answer[num_list.length - 1] * 2;
        return answer;
    }
    public static void main(String[] args) {
        int[] num_list = {5, 2, 1, 7, 5};
        System.out.println(Arrays.toString(solution(num_list)));

    }
}
