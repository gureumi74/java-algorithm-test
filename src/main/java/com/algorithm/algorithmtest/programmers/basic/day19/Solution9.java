package com.algorithm.algorithmtest.programmers.basic.day19;

public class Solution9 {
    public static void main(String[] args) {
        String my_string = "banana";
        String is_suffix = "abanana";
        System.out.println(my_string.substring(my_string.length() - is_suffix.length()).equals(is_suffix));
    }
}
