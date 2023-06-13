package com.algorithm.algorithmtest.programmers.kit;

import java.util.*;

public class pro42576 {
    public static String solution(String[] participant, String[] completion) {
//        Arrays.sort(participant);
//        Arrays.sort(completion);
//
//        for(int i = 0; i < completion.length; i++) {
//            if(!participant[i].equals(completion[i])) return participant[i];
//        }
//
//        return participant[participant.length - 1];

        HashMap<String, Integer> map = new HashMap<>();
        for(String s : participant) map.put(s, map.getOrDefault(s, 0) + 1);
        for(String s : completion) map.put(s, map.get(s) - 1);

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() != 0) return entry.getKey();
        }

        return "";
    }
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        System.out.println(solution(participant, completion));

    }
}
