package com.algorithm.algorithmtest.programmers.basic.day18;

import java.util.*;

public class Basic2 {
    public static void main(String[] args) {
        int a = 2, b = 5, c = 2, d = 6;
        System.out.println(solution(a, b, c, d));
    }
    public static int solution(int a, int b, int c, int d) {
        int answer = 0;
        List<Integer> list = Arrays.asList(a, b, c, d);
        list.sort(Comparator.naturalOrder());
        HashSet<Integer> set = new HashSet<>(list);
        System.out.println(set);

        switch (set.size()) {
            case 1:
                answer = 1111 * a;
                break;
            case 2 :
                if(list.get(1) == list.get(2)) {
                    answer = (int) (list.get(0) == list.get(1) ? Math.pow(10 * list.get(0) + list.get(3), 2)
                                                : Math.pow(10 * list.get(3) + list.get(0), 2));
                } else {
                    answer = (list.get(1) + list.get(2)) * Math.abs(list.get(1) - list.get(2));
                }
                break;
            case 3 :
                int n = 0;
                answer = 1;
                for(int i = 1; i < 4; i++) {
                    if(list.get(i) == list.get(i - 1)) {
                        n = list.get(i);
                        break;
                    }
                }
                for(int i = 0; i < 4; i++) {
                    if(n != list.get(i)) {
                        answer *= list.get(i);
                    }
                }
                break;
            default:
                answer = list.get(0);
        }
        return answer;
    }
}
