package com.algorithm.algorithmtest.programmers.basic.day20;

public class Solution4 {
    public String solution(String polynomial) {
        String answer = "";

        int constantSum = 0;
        int xSum = 0;

        String[] strArr = polynomial.replaceAll(" \\+ ", "+").split("\\+");
        for(int i = 0; i < strArr.length; i++) {
            if(strArr[i].charAt(0) == 'x') {
                xSum++;
            } else if(strArr[i].charAt(strArr[i].length() - 1) == 'x') {
                int n = Integer.parseInt(strArr[i].substring(0, strArr[i].length() - 1));
                xSum += n;
            } else {
                constantSum += Integer.parseInt(strArr[i]);
            }
        }

        if(xSum != 0 && constantSum != 0) {
            answer += xSum == 1 ? "x + " : xSum + "x + ";
            answer += constantSum;
        } else if (xSum != 0) {
            answer += xSum == 1 ? "x" : xSum + "x";
        } else if (constantSum != 0) {
            answer += constantSum;
        }
        return answer;

    }
    public static void main(String[] args) {
        String polynomial = "3x + 7 + x";
        Solution4 result = new Solution4();
        System.out.println(result.solution(polynomial));
    }
}
