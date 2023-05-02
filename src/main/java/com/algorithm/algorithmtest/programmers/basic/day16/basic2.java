package com.algorithm.algorithmtest.programmers.basic.day16;

public class basic2 {
    public static String solution(int[] numLog) {
        String answer = "";
        for(int i = 1; i < numLog.length; i++) {
            switch (numLog[i] - numLog[i - 1]) {
                case 1 -> answer += "w";
                case -1 -> answer += "s";
                case 10 -> answer += "d";
                case -10 -> answer += "a";
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] log = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        System.out.println(solution(log));

    }
}
