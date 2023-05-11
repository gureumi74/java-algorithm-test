package com.algorithm.algorithmtest.programmers.basic.day21;

import java.util.Arrays;

public class Solution1 {
    public int solution(String my_string) {
        int answer = 0;
        String[] strArr = my_string.split("[a-z|A-Z]");
        for(int i = 0; i < strArr.length; i++) {
            if(!strArr[i].equals("")) {
                answer += Integer.parseInt(strArr[i]);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.solution(my_string));
    }
}
