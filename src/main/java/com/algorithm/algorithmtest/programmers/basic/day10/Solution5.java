package com.algorithm.algorithmtest.programmers.basic.day10;

public class Solution5 {
    public String solution(int q, int r, String code) {
        String answer = "";
        for(int i = 0; i < code.length(); i++) {
            if(i % q == r) answer += code.charAt(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        int q = 3;
        int r = 1;
        String code = "qjnwezgrpirldywt";

        Solution5 solution5 = new Solution5();
        System.out.println(solution5.solution(q, r, code));
    }
}
