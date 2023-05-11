package com.algorithm.algorithmtest.programmers.basic.day21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution4 {
    public static int solution(String[] spell, String[] dic) {
        for(int i = 0; i < dic.length; i++) {
            List<String> list = new ArrayList<>(Arrays.asList(spell));
            for(int j = 0; j < dic[i].length(); j++) {
                if(list.contains(String.valueOf(dic[i].charAt(j)))) {
                    list.remove(String.valueOf(dic[i].charAt(j)));
                }
            }
            if(list.size() == 0) {
                return 1;
            }
        }
        return 2;
    }
    public static void main(String[] args) {
        String[] spell = {"z", "d", "x"};
        String[] dic = {"def", "dww", "dzx", "loveaw"};
        System.out.println(solution(spell, dic));
    }
}
