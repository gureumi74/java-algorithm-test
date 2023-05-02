package com.algorithm.algorithmtest.programmers.basic.day16;

import com.algorithm.algorithmtest.Array.IntArray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class basic4 {
    public static int[] solution(int n) {
        int[] answer;
        ArrayList<Integer> list = new ArrayList();
        list.add(n);
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            list.add(n);
        }
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Arrays.toString(solution(n)));

    }
}
