package com.algorithm.algorithmtest.programmers.basic.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S4 {
    public static int[] solution(int[] arr) {
        int[] answer = {};
        int start = -1;
        int end = -1;
        boolean check = false;
        for(int i = 0; i < arr.length; i++) {
            if(!check && arr[i] == 2) {
                start = i;
                check = true;
            }
            else if(check && arr[i] == 2) {
                end = i;
            }
        }

        if(start == -1) answer = new int[]{-1};
        else if(end == -1) answer = new int[]{2};
        else answer = Arrays.copyOfRange(arr, start, end + 1);
        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 4, 5, 2, 9};
        System.out.println(Arrays.toString(solution(arr)));
    }
}
