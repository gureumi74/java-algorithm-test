package com.algorithm.algorithmtest.programmers.basic.day11;

public class Solution2 {
    public static int solution(int n) {
        if (n < 4) {
            return 0;
        }

        int answer = 0;

        for(int i = 4; i <= n; i++) {
            int composite3Num = 0;
            for(int j = 1; j <= i; j++) {
                if (i % 2 == 0 || i % j == 0) {
                    composite3Num++;
                }
                if (composite3Num >= 3) {
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));
    }
}
