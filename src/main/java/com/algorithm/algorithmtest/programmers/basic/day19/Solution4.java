package com.algorithm.algorithmtest.programmers.basic.day19;

public class Solution4 {
    public static void main(String[] args) {
        int[] array = {149, 180, 192, 170};
        int height = 167;
        System.out.println(solution(array, height));
    }
    public static int solution(int[] array, int height) {
        int answer = 0;
        for(int i : array) {
            if(i > height) answer++;
        }
        return answer;
    }
}
