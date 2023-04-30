package com.algorithm.algorithmtest.programmers.basic.day13;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Solution4 {
    public static int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        return sides[2] < sides[0] + sides[1] ? 1 : 2;
    }

    public static void main(String[] args) {
        int[] sides = {1, 2, 3};
        System.out.println(solution(sides));
    }
}
