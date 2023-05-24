package com.algorithm.algorithmtest.programmers.basic.day11;

import java.util.Arrays;

public class basic1 {
    public static int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            System.out.println(c);
            if(c >= 97 && c < 123) answer[c - 'a' + 26]++;
            else answer[c - 'A']++;
        }
        return answer;
    }
    public static void main(String[] args) {
        String my_string = "Programmers";
        System.out.println(Arrays.toString(solution(my_string)));
//        [0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,1,0,0,0,0,0,2,0,1,0,0,3,1,0,0,0,0,0,0,0]
//        [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,1,0,0,0,0,0,2,0,1,0,0,3,1,0,0,0,0,0,0,0]

    }
}
