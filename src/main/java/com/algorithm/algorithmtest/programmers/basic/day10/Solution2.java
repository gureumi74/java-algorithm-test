package com.algorithm.algorithmtest.programmers.basic.day10;

public class Solution2 {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.substring(0, i).equals(is_prefix)) return 1;
        }
        return answer;
    }
    public static void main(String[] args) {
        String my_string = "banana";
        String is_prefix = "ban";
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.solution(my_string, is_prefix));
    }
}
