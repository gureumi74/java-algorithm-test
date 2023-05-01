package com.algorithm.algorithmtest.programmers.basic.day15;

public class Solution1 {
    public static long solution(String numbers) {
        long answer = 0;
        String[] numberStr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < numberStr.length; i++) {
            numbers = numbers.replaceAll(numberStr[i], String.valueOf(i));
        }

        answer = Long.parseLong(numbers);
        return answer;
    }
    public static void main(String[] args) {
        String numbers = "onetwothreefourfivesixseveneightnine";
        System.out.println(solution(numbers));
    }
}
