package com.algorithm.algorithmtest.programmers.basic.day19;

public class Solution3 {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 4, 5};
        int n = 1;
        System.out.println(solution(array, n));
    }
    public static int solution(int[] array, int n) {
        int answer = 0;
        for(int i : array) {
            if(i == n) {
                answer++;
            }
        }
        return answer;
    }
}
