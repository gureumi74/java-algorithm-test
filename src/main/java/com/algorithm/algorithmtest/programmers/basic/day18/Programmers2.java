package com.algorithm.algorithmtest.programmers.basic.day18;

public class Programmers2 {
    public static void main(String[] args) {
        int n = 976;
        System.out.println(solution(n));
    }
    public static int solution(int n) {
        for(int i = 2; i * i <= n; i++) {
            if(i * i == n) {
                return 1;
            }
        }
        return 2;
    }
}
