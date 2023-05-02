package com.algorithm.algorithmtest.programmers.basic.day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class basic5 {
    public static int[] solution(int[] arr) {
        int[] stk = {};
        int i = 0;
        List<Integer> list = new ArrayList<>();
        while (i < arr.length) {
            if (list.size() == 0) {
                list.add(arr[i]);
                i++;
            } else if (list.size() != 0 && list.get(list.size() - 1) < arr[i]) {
                list.add(arr[i]);
                i++;
            } else {
                list.remove(list.size() - 1);
            }
        }

        stk = new int[list.size()];

        for(int j = 0; j < stk.length; j++) {
            stk[j] = list.get(j);
        }
        return stk;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        System.out.println(Arrays.toString(solution(arr)));
    }


}
