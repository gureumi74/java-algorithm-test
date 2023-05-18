package com.algorithm.algorithmtest.programmers.basic.day10;

public class Solution4 {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        for(int i = c - 1; i < my_string.length(); i += m) {
            answer += my_string.charAt(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        String my_string = "ihrhbakrfpndopljhygc";
        int m = 4;
        int c = 2;
        Solution4 solution4 = new Solution4();
        System.out.println(solution4.solution(my_string, m, c));
    }
}
