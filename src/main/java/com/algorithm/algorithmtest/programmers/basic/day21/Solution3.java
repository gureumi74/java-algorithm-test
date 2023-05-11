package com.algorithm.algorithmtest.programmers.basic.day21;

import java.util.Arrays;

public class Solution3 {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        return sides[1] - (sides[1] - sides[0]) + sides[1] + sides[0] - (sides[1] + 1);
    }
    public static void main(String[] args) {
        int[] sides = {3, 6};
        Solution3 solution3 = new Solution3();
        System.out.println(solution3.solution(sides));

    }
}
