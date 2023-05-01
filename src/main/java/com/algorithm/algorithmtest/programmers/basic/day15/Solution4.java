package com.algorithm.algorithmtest.programmers.basic.day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution4 {
    public static int[] solution(int n) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i <= n/2; i++) {
            if(n % i == 0) {
                list.add(i);
            }
        }
        list.add(n);


        return list.stream().mapToInt(i -> i).toArray();
    }
    public static void main(String[] args) {
        int n = 24;
        System.out.println(Arrays.toString(solution(n)));
    }
}
