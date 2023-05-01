package com.algorithm.algorithmtest.programmers.basic.day14;

public class basic3 {
    public static int solution(int[] num_list) {
        int multiple = 1;
        int sum = 0;
        for(int i = 0; i < num_list.length; i++) {
            multiple *= num_list[i];
            sum += num_list[i];
        }

        return multiple > Math.pow(sum, 2) ? 0 : 1;
    }
    public static void main(String[] args) {
        int[] num_list = {5, 7, 8, 3};
        System.out.println(solution(num_list));
    }
}
