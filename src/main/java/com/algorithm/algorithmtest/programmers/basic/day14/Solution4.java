package com.algorithm.algorithmtest.programmers.basic.day14;

public class Solution4 {
    public static String solution(String my_string) {
        String answer = "";
        // a = 97, A = 65 차이 32
        for(int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) >= 97) {
                answer += (char)(my_string.charAt(i) - 32);
            } else {
                answer += (char)(my_string.charAt(i) + 32);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        String my_string = "cccCCC";
        System.out.println(solution(my_string));
    }
}
