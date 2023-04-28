package com.algorithm.algorithmtest.programmers.basicday11;

public class Solution1 {
    public static int solution(int[] box, int n) {
        int answer = (box[0] / n) * (box[1] / n) * (box[2] / n);
        return answer;
    }
    public static void main(String[] args) {
        int[] box = {1, 1, 1};
        int n = 1;
        int result = solution(box, n);
        System.out.println(result);
    }
}
