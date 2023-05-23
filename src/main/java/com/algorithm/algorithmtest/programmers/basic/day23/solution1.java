package com.algorithm.algorithmtest.programmers.basic.day23;

import java.util.*;

public class solution1 {

    public static int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < numlist.length; i++) {
            map.put(numlist[i], Math.abs(n - numlist[i]));

        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());

        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if(o1.getValue().equals(o2.getValue())) {
                    return o2.getKey().compareTo(o1.getKey());
                } else {
                    return o1.getValue().compareTo(o2.getValue());
                }
            }
        });

        for(int i = 0; i < numlist.length; i++) {
            answer[i] = entryList.get(i).getKey();
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] numlist = {600, 400, 300, 200, 700, 800, 100, 900};
        int n = 500;
        System.out.println(Arrays.toString(solution(numlist, n)));
    }

}
