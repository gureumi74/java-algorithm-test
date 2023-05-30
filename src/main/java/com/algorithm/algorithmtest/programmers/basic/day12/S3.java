package com.algorithm.algorithmtest.programmers.basic.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S3 {
    public static int[] solution(int[] arr, int[][] intervals) {
        int[] arr1 = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1] + 1);
        int[] arr2 = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1] + 1);
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr1.length + arr2.length; i++) {
            if(i < arr1.length) list.add(arr1[i]);
            else list.add(arr2[i - arr1.length]);
        }

        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[][] intervals = {{1, 3}, {0, 4}};
        System.out.println(Arrays.toString(solution(arr, intervals)));
    }
}
