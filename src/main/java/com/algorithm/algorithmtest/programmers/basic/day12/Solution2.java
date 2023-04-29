package com.algorithm.algorithmtest.programmers.basic.day12;

import java.util.Arrays;

public class Solution2 {
    public static int[] solution(String my_string) {
        my_string = my_string.replaceAll("[a-z]", "");
        int[] answer = new int[my_string.length()];
        for(int i = 0; i < my_string.length(); i++) {
            answer[i] = Character.getNumericValue(my_string.charAt(i));
        }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        String my_string = "hi12392";
        System.out.println(Arrays.toString(solution(my_string)));
    }
}
