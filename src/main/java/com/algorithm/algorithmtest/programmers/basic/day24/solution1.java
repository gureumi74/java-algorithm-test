package com.algorithm.algorithmtest.programmers.basic.day24;

public class solution1 {
    public static int solution(int chicken) {
        int answer = 0;
        while (chicken >= 10) {
            answer += chicken / 10;
            chicken = chicken / 10 + chicken % 10;
        }
        return answer;
    }
    public static void main(String[] args) {
        int chicken = 1081;
        System.out.println(solution(chicken));
    }
}
