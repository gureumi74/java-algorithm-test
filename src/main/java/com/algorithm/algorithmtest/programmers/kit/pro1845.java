package com.algorithm.algorithmtest.programmers.kit;

import java.util.*;

public class pro1845 {
    public static int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        return Math.min(nums.length / 2, set.size());
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 3};
        System.out.println(solution(nums));
    }
}
