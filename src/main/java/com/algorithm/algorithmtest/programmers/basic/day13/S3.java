package com.algorithm.algorithmtest.programmers.basic.day13;

import java.util.Arrays;

public class S3 {
    public static String[] solution(String[] str_list) {
        for(int i = 0; i < str_list.length; i++) {
            if(str_list[i].equals("l")) {
                return Arrays.copyOfRange(str_list, 0, i);
            } else if(str_list[i].equals("r")) {
                return Arrays.copyOfRange(str_list, i + 1, str_list.length);
            }
        }
        return null;
    }
    public static void main(String[] args) {
        String[] str_list = {"l", "u", "u", "l", "r"};
        System.out.println(Arrays.toString(solution(str_list)));
    }
}
