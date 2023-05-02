package com.algorithm.algorithmtest.programmers.basic.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2 {
    public static int[] solution(int n, int[] numlist) {
        List list = new ArrayList();

        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                list.add(numlist[i]);
            }
        }

        return list.stream().mapToInt(x -> (int) x).toArray();
    }
    public static void main(String[] args) {
        int n = 3;
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println(Arrays.toString(solution(n, numlist)));
    }
}
