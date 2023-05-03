package com.algorithm.algorithmtest.programmers.basic.day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Programmers4 {
    public static void main(String[] args) {
        String my_string = "Bcad";
        System.out.println(solution(my_string));
    }
    public static String solution(String my_string) {
        String answer = "";
        char[] my_stringArr = my_string.toCharArray();
        for(int i = 0; i < my_stringArr.length; i++) {
            if(my_stringArr[i] >= 65 && my_stringArr[i] < 91) {
                my_stringArr[i] += 32;
            }
        }
        Arrays.sort(my_stringArr);
        for(char i : my_stringArr) {
            answer += String.valueOf(i);
        }

        return answer;
    }
}
