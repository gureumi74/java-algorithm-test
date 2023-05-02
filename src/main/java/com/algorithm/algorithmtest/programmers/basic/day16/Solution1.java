package com.algorithm.algorithmtest.programmers.basic.day16;

public class Solution1 {
    public static int solution(String message) {

        return message.length() * 2;
    }
    public static void main(String[] args) {
        String message = "happy birthday!";
        System.out.println(solution(message));

    }
}
