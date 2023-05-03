package com.algorithm.algorithmtest.programmers.basic.day18;

import javafx.beans.binding.StringBinding;

public class Basic5 {
    public static void main(String[] args) {
        String my_string = "rermgorpsam";
        int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
        System.out.println(solution(my_string, queries));

    }
    public static String solution(String my_string, int[][] queries) {
        for(int i = 0; i < queries.length; i++) {
            String answer = "";
            int start = queries[i][0];
            int end = queries[i][1];

            answer += my_string.substring(0, start);

            StringBuilder sb = new StringBuilder(my_string.substring(start, end + 1));
            sb.reverse();
            answer += sb.toString();

            answer += my_string.substring(end + 1);
            my_string = answer;
        }

        return my_string;
    }
}
