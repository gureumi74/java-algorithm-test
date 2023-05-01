package com.algorithm.algorithmtest.programmers.basic.day15;

public class Solution2 {
    public static String solution(String my_string, int num1, int num2) {
        String answer = "";
        StringBuilder br = new StringBuilder(my_string);
        char tmp = br.charAt(num1);
        br.setCharAt(num1, br.charAt(num2));
        br.setCharAt(num2, tmp);
        answer = br.toString();

        return answer;
    }
    public static void main(String[] args) {
        String my_string = "hello";
        int num1 = 1;
        int num2 = 2;
        System.out.println(solution(my_string, num1, num2));
    }
}
