package com.algorithm.algorithmtest.programmers.basic.day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution8 {
    public static void main(String[] args) {
        String my_string = "banana";
        System.out.println(Arrays.toString(solution(my_string)));
    }
    public static String[] solution(String my_string) {
        List<String> list = new ArrayList();
        for(int i = 0; i < my_string.length(); i++) {
           list.add(my_string.substring(i));
        }
        list.sort(Comparator.naturalOrder());
        return list.toArray(new String[0]);
    }
}
