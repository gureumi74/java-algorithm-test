package com.algorithm.algorithmtest.programmers.basic.day22;

public class S5 {
    public static int solution(int a, int b) {
        int answer = 0;
        int gcdNum = gcd(a, b);
        b = b / gcdNum;

         while (b % 2 == 0) b /= 2;
        while (b % 5 == 0) b /= 5;
        if(b == 1) return 1;


        return 2;
    }
    public static int gcd(int a, int b) {
        if(b == 0) return a;
        else return gcd(b, a % b);
    }
    public static void main(String[] args) {
        int a = 7;
        int b = 20;
        System.out.println(solution(a, b));

    }
}
