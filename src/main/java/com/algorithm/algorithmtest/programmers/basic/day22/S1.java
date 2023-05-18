package com.algorithm.algorithmtest.programmers.basic.day22;

public class S1 {
    public int solution(int n) {
        int answer = 1;
        int cnt = 1;
        String numStr = "";

        while (true) {
            if (answer % 3 == 0) {
                answer++;
                continue;
            }

            numStr = String.valueOf(answer);
            if (numStr.contains("3")) {
                answer++;
                continue;
            }

            if(cnt == n) break;
            answer++;
            cnt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 15;
        S1 s1 = new S1();
        System.out.println(s1.solution(n));
    }
}
