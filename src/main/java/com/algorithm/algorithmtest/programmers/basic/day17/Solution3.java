package com.algorithm.algorithmtest.programmers.basic.day17;

public class Solution3 {
    public static int solution(int n) {
        int answer = 0;
        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(solution(n));
    }
}
