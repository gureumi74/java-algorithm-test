package com.algorithm.algorithmtest.programmers.basic.day22;

import java.util.*;

public class S3 {
    public static int solution(int[][] lines) {
        int answer = 0;
        return answer;
    }
    public static void main(String[] args) {
        int[][] lines = {{0, 2}, {-3, -1}, {-2, 1}};
        System.out.println(solution(lines));
        Arrays.sort(lines, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
        });

        System.out.println(lines);

        for(int i = 0; i < lines.length; i++) {
            System.out.println(Arrays.toString(lines[i]));
        }
    }
}
