package com.algorithm.algorithmtest.programmers.basic.day15;

import java.util.Arrays;
import java.util.HashMap;

public class Solution3 {
    public static String solution(String s) {
        String answer = "";
        int[] alphabet = new int[32];
        for(int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < alphabet.length; i++) {
            if(alphabet[i] == 1) {
                answer += (char) (i + 'a');
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        String s = "abdc";
        System.out.println(solution(s));
    }
}
