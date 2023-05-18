package com.algorithm.algorithmtest.programmers.basic.day10;

public class Solution3 {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder(my_string.substring(s, e + 1));
        String answer = my_string.substring(0, s) + sb.reverse().toString() + my_string.substring(Math.min(e + 1, my_string.length() - 1));
        return answer;
    }
    public static void main(String[] args) {
        String my_string = "Progra21Sremm3";
        int s = 6;
        int e = 12;
        Solution3 solution3 = new Solution3();
        System.out.println(solution3.solution(my_string, s, e));
    }
}
