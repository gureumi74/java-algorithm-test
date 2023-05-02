package com.algorithm.algorithmtest.programmers.basic.day17;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution4 {
    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i = 0; i < quiz.length; i++) {
            quiz[i] = quiz[i].replace("- -", "+");
            quiz[i] = quiz[i].replace("+ -", "-");
            quiz[i] = quiz[i].replace("- ", "-");
            quiz[i] = quiz[i].replace("+ ", "+");
            String[] sArr = quiz[i].split(" ");
            if(Integer.parseInt(sArr[0]) + Integer.parseInt(sArr[1]) == Integer.parseInt(sArr[3])) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }
        return answer;
    }
    public static String[] solution2(String[] quiz) {
        for(int i = 0; i < quiz.length; i++) {
            String[] quizArr = quiz[i].split(" ");
            int result = (Integer.parseInt(quizArr[0]) + Integer.parseInt(quizArr[2])) * (quizArr[1].equals("+") ? 1 : -1);
            quiz[i] = result == Integer.parseInt(quizArr[4]) ? "O" : "X";
        }
        return quiz;
    }
    public static void main(String[] args) {
        String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};
        System.out.println(Arrays.toString(solution2(quiz)));
    }
}
