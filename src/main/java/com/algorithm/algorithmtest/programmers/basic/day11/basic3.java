package com.algorithm.algorithmtest.programmers.basic.day11;

public class basic3 {
    public static String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder(my_string);
        for(int i = 0; i < indices.length; i++) {
            sb.setCharAt(indices[i], '0');
        }

        return sb.toString().replace("0", "");
    }
    public static void main(String[] args) {
        String my_string = "apporoograpemmemprs";
        int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
        System.out.println(solution(my_string, indices));
    }
}
