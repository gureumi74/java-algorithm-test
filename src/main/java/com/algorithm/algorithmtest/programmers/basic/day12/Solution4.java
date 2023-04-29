package com.algorithm.algorithmtest.programmers.basic.day12;

import java.util.*;

public class Solution4 {
    public static List<Integer> solution(int n) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 2; i <= n; i++) {
            while (n % i == 0) {
                set.add(i);
                n /= i;
            }
        }
        List<Integer> list = new ArrayList<>(set);
        list.sort(Comparator.naturalOrder());
        return list;
    }
    public static void main(String[] args) {
        int n = 420;
        System.out.println(solution(n));
    }

}
