package com.algorithm.algorithmtest.programmers.basic.day14;

public class Solution2 {
    public static int solution(int order) {
        int answer = 0;
        String orderStr = String.valueOf(order);
        for (int i = 0; i < orderStr.length(); i++) {
            if(orderStr.charAt(i) == '3' || orderStr.charAt(i) == '6' || orderStr.charAt(i) == '9') {
                answer++;
            }
        }
        return answer;
    }
    public static int solution2(int order) {
        int answer = 0;
        while (order != 0) {
            if (order % 10 == 3 || order % 10 == 6 || order % 10 == 9) {
                answer++;
            }
            order /= 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        int order = 29423;
        System.out.println(solution2(order));
    }
}
