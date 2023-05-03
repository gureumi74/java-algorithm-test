package com.algorithm.algorithmtest.programmers.basic.day18;

public class Basic4 {
    public static void main(String[] args) {
        String number = "78720646226947352489";
        System.out.println(solution(number));
    }
    public static int solution(String number) {
        int answer = 0;
        for(int i = 0; i < number.length(); i++) {
            answer += Integer.parseInt(String.valueOf(number.charAt(i)));
        }

        return answer % 9;
    }
}
