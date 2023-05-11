package com.algorithm.algorithmtest.programmers.basic.day20;

import java.util.Arrays;

public class Solution3 {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int answer = numbers[numbers.length - 2] * numbers[numbers.length - 1];
        return answer > numbers[0] * numbers[1] ? answer : numbers[0] * numbers[1];
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, -3, 4, -5};
        Solution3 result = new Solution3();
        System.out.println(result.solution(numbers));
    }
}
