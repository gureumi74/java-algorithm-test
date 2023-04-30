package com.algorithm.algorithmtest.programmers.basic.day13;

import java.util.StringTokenizer;

public class Solution1 {
    public static int solution(String s) {
        int answer = 0;
        String[] input = s.split(" ");
        for(int i = 0; i < input.length; i++) {
            if (input[i].equals("Z")) {
                answer -= Integer.parseInt(input[i - 1]);
            } else {
                answer += Integer.parseInt(input[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "1 2 Z 3";
        System.out.println(solution(s));
    }
}
