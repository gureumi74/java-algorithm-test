package com.algorithm.algorithmtest.programmers.basic.day20;

import java.util.Arrays;

public class Solution1 {
    public int[] solution(String[] keyInput, int[] border) {
        int[] location = {0, 0};
        for(int i = 0; i < keyInput.length; i++) {
            switch (keyInput[i]) {
                case "left" :
                    if(location[0] != border[0] / 2 * -1) {
                        location[0]--;
                    }
                    break;
                case "right" :
                    if(location[0] != border[0] / 2) {
                        location[0]++;
                    }
                    break;
                case "up" :
                    if(location[1] != border[1] / 2) {
                        location[1]++;
                    }
                    break;
                case "down" :
                    if(location[1] != border[1] / 2 * -1) {
                        location[1]--;
                    }
                    break;
            }
        }
        return location;
    }

    public static void main(String[] args) {
        String[] keyInput = {"left", "right", "up", "right", "right"};
        int[] border = {11, 11};
        Solution1 result = new Solution1();
        System.out.println(Arrays.toString(result.solution(keyInput, border)));
    }
}
