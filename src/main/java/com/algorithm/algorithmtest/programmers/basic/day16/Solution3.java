package com.algorithm.algorithmtest.programmers.basic.day16;

public class Solution3 {
    public static int solution(String my_string) {
        String[] my_stringArr = my_string.split(" ");
        int answer = Integer.parseInt(my_stringArr[0]);
        for(int i = 0; i < my_stringArr.length; i++) {
            if (my_stringArr[i].equals("+")) {
                i++;
                answer += Integer.parseInt(my_stringArr[i]);
            } else if (my_stringArr[i].equals("-")) {
                i++;
                answer -= Integer.parseInt(my_stringArr[i]);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        String my_string = "3 + 4";
        System.out.println(solution(my_string));
    }
}
