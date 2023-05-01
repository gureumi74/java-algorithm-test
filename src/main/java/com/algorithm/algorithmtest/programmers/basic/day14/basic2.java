package com.algorithm.algorithmtest.programmers.basic.day14;

public class basic2 {
    public static int solution(int a, int b, int c) {
        int answer = a + b + c;
        if (a == b && b == c) {
            answer *= (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) * (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
        } else if (a == b || a == c || b == c) {
            answer *= (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        }

        return answer;
    }
    public static void main(String[] args) {
        int a = 4;
        int b = 4;
        int c = 4;
        System.out.println(solution(a, b, c));
    }

}
