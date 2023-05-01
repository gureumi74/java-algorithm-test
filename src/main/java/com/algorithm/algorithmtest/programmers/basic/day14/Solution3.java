package com.algorithm.algorithmtest.programmers.basic.day14;

public class Solution3 {
    public static String solution(String cipher, int code) {
        String answer = "";
        for(int i = code - 1; i < cipher.length(); i += code) {
            answer += cipher.charAt(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;
        System.out.println(solution(cipher, code));
    }
}
