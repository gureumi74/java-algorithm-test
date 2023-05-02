package com.algorithm.algorithmtest.programmers.basic.day16;

import java.util.Arrays;

public class basic1 {
    public static int solution(int n, String control) {
        int answer = n;
        int[] controlCheck = new int[4];
        for(int i = 0; i < control.length(); i++) {
            switch (control.charAt(i)) {
                case 'w' -> controlCheck[0]++;
                case 's' -> controlCheck[1]++;
                case 'd' -> controlCheck[2]++;
                case 'a' -> controlCheck[3]++;
            }
        }
        answer = controlCheck[0] - controlCheck[1] + (controlCheck[2] * 10) - (controlCheck[3] * 10);

        return answer;
    }
    public static void main(String[] args) {
        int n = 0;
        String control = "wsdawsdassw";
        System.out.println(solution(n, control));
    }
}
