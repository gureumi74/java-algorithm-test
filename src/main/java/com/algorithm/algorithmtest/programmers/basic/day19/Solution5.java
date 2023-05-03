package com.algorithm.algorithmtest.programmers.basic.day19;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution5 {
    public static void main(String[] args) {
        String[] intStrs = {"0123456789","9876543210","9999999999999"};
        int k = 50000;
        int s = 5; // 시작 인덱스
        int l = 5; // 자른 문자열의 길이
        System.out.println(Arrays.toString(solution(intStrs, k, s, l)));
    }
    public static int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        List list = new ArrayList();
        for(int i = 0; i < intStrs.length; i++) {
            String subStringStr = intStrs[i].substring(s, s + l);
            if(Integer.parseInt(subStringStr) > k) {
                list.add(Integer.parseInt(subStringStr));
            }
        }
        answer = list.stream().mapToInt(x -> (int) x).toArray();
        return answer;
    }
}
