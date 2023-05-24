package com.algorithm.algorithmtest.programmers.basic.day24;

public class Solution2 {
    public static String solution(String bin1, String bin2) {
        int bin = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);
        return Integer.toBinaryString(bin);
    }
    public static void main(String[] args) {
        String bin1 = "10";
        String bin2 = "11";
        System.out.println(solution(bin1, bin2));

    }
}
