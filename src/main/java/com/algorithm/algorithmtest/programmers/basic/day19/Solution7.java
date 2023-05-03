package com.algorithm.algorithmtest.programmers.basic.day19;

public class Solution7 {
    public static void main(String[] args) {
        String my_sting = "ProgrammerS123";
        int n = 11;
        System.out.println(solution(my_sting, n));
    }
    public static String solution(String my_string, int n) {
        return my_string.substring(my_string.length() - n);
    }
}
