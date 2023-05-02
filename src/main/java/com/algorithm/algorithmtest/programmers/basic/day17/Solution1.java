package com.algorithm.algorithmtest.programmers.basic.day17;

public class Solution1 {
    public static int solution(int num, int k) {
        int answer = -1;
        String numStr = String.valueOf(num);
        for(int i = 0; i < numStr.length(); i++) {
            if(Integer.parseInt(String.valueOf(numStr.charAt(i))) == k) {
                answer = i + 1;
                break;
            }
        }
        return answer;
    }
    public static int solution2(int num, int k) {
        // 다른 사람 풀이 ㅋㅋ.ㅋ... 뭐야 이거.. 희표좌..
        return ("-" + num).indexOf(String.valueOf(k));
    }
    public static void main(String[] args) {
        int num = 29183;
        int k = 1;
        System.out.println(solution(num, k));

    }
}
