package com.algorithm.algorithmtest.programmers.basic.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1 {
    public static String solution(String my_string) {
        String answer = "";
        List<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        for(int i = 0; i < my_string.length(); i++) {
            if(!list.contains(my_string.charAt(i))) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }

    public static String solution2(String my_string) {
        /*
         * 다른 사람 풀이에서 엄청 간단하게 적을 수 있어서 찾아왔다.
         */
        String answer = "";
        answer = my_string.replaceAll("[aeiou]", "");
        return answer;
    }

    public static void main(String[] args) {
        String my_string = "bus";
        System.out.println(solution(my_string));
    }
}
