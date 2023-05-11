package com.algorithm.algorithmtest.programmers.basic.day20;

import java.util.ArrayList;
import java.util.HashSet;

public class Solution2 {
    public int solution(int[][] dots) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        for(int i = 0; i < dots.length; i++) {
            hs1.add(dots[i][0]);
            hs2.add(dots[i][1]);
        }
        ArrayList<Integer> list = new ArrayList(hs1);
        int x = Math.abs(list.get(0) - list.get(1));
        list = new ArrayList<>(hs2);
        int y = Math.abs(list.get(0) - list.get(1));

        return x * y;

    }
    public static void main(String[] args) {
        int[][] dots = {{-1, -1}, {1, 1}, {1, -1}, {-1, 1}};
        Solution2 result = new Solution2();
        System.out.println(result.solution(dots));
    }
}
