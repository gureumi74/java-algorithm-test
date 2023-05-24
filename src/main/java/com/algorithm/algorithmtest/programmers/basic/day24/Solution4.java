package com.algorithm.algorithmtest.programmers.basic.day24;

public class Solution4 {
    public static int solution(int i, int j, int k) {
        int answer = 0;
        for(int n = i; n <= j; n++) {
            int num = n;
            while (num > 0) {
                if(num % 10 == k) {
                    answer++;
                }
                num /= 10;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int i = 1;
        int j = 13;
        int k = 1;
        System.out.println(solution(i, j, k));

    }
}
