package com.algorithm.algorithmtest.programmers.basic.day25;

public class Solution1 {
    public static int solution(String A, String B) {
        for(int i = 0; i < A.length(); i++) {
            if(A.equals(B)) return i;
            A = A.charAt(A.length() - 1) + A.substring(0, A.length() - 1);
        }
        return -1;
    }
    public static void main(String[] args) {
        String A = "hello";
        String B = "ohell";
        System.out.println(solution(A, B));
    }
}
