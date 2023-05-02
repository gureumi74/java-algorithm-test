package com.algorithm.algorithmtest.programmers.basic;

import java.util.*;

public class Solution {
    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, Comparator.comparing(s -> s.substring(n)));

        return strings;
    }
    public static void main(String[] args) {
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;
        System.out.println(Arrays.toString(solution(strings, n)));


    }
}
