package com.algorithm.algorithmtest.programmers.basic.day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution3 {
    public static String solution(String my_string) {
        String answer = "";
        List<Character> list = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i++) {
            if(!list.contains(my_string.charAt(i))) {
                answer += my_string.charAt(i);
                list.add(my_string.charAt(i));
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        String my_string = "people";
        System.out.println(solution(my_string));
    }
}
