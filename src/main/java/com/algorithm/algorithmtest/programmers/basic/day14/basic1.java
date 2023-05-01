package com.algorithm.algorithmtest.programmers.basic.day14;

public class basic1 {
    public static int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for(int i = 0; i < included.length; i++) {
            if(included[i]) {
                answer += a + d * i;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int a = 3;
        int d = 4;
        boolean[] included = {true, false, false, true, true};
        System.out.println(solution(a, d, included));

    }
}
