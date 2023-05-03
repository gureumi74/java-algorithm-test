package com.algorithm.algorithmtest.programmers.basic.day18;

public class Basic3 {
    public static void main(String[] args) {
        String my_string = "cvsgiorszzzmrpaqpe";
        int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
        System.out.println(solution(my_string, index_list));
    }
    public static String solution(String my_string, int[] index_list) {
        String answer = "";
        for(int i = 0; i < index_list.length; i++) {
            answer += my_string.charAt(index_list[i]);
        }
        return answer;
    }
}
