package com.algorithm.algorithmtest.programmers.basic.day12;

public class Solution3 {
    public static int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[A-Z|a-z]", "");
        for(int i = 0; i < my_string.length(); i++) {
            answer += Character.getNumericValue(my_string.charAt(i));
        }
        return answer;
    }

    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";
        System.out.println(solution(my_string));
    }
}
