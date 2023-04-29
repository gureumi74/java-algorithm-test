package com.algorithm.algorithmtest.programmers.basic.day11;

public class Solution4 {
    public static int solution(int n) {
        int answer = 0;
        int factorial = 1;

        while (factorial <= n) {
            factorial *= answer + 1;
            answer++;
        }

        return answer - 1;
    }

    public static void main(String[] args) {
        int n = 121;
        System.out.println(solution(n));
    }
}
