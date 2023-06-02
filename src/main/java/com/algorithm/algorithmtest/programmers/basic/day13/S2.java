package com.algorithm.algorithmtest.programmers.basic.day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.copyOfRange;

public class S2 {
    public static int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];

        for(int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[(i + n) % num_list.length];
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] num_list = {2, 1, 6};
        int n = 1;
        System.out.println(Arrays.toString(solution(num_list, n)));
    }
}
