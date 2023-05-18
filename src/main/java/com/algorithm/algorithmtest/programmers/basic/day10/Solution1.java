package com.algorithm.algorithmtest.programmers.basic.day10;

public class Solution1 {
    public String solution(String my_string, int n) {
        return my_string.substring(0, n);
    }
    public static void main(String[] args) {
        String my_string = "ProgrammerS123";
        int n = 11;
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.solution(my_string, n));
    }
}
