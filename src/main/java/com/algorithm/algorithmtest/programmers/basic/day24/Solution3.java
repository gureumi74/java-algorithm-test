package com.algorithm.algorithmtest.programmers.basic.day24;

public class Solution3 {
    public static int solution(String before, String after) {
        for(char c : after.toCharArray()) {
            before = before.replaceFirst(String.valueOf(c), "");
        }

        if(before.isEmpty()) return 1;
        return 0;
    }
    public static void main(String[] args) {
        String before = "olleh";
        String after = "hello";
        System.out.println(solution(before, after));
    }
}
