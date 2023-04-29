package com.algorithm.algorithmtest.programmers.basic.day11;

import java.util.Arrays;

public class Solution3 {
    public static int solution(int[] numbers) {
        Arrays.sort(numbers);

        int answer = numbers[numbers.length - 2] * numbers[numbers.length - 1];
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {0, 31, 24, 10, 1, 9};
        System.out.println(solution(numbers));
    }
}
