package com.algorithm.algorithmtest.programmers.kit;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class pro42577 {
    public static boolean solution(String[] phone_book) {
        HashMap<String, String> map = new HashMap<>();
        for(String s : phone_book) map.put(s, s);

        for(Map.Entry<String, String> entry : map.entrySet()) {
            String s = entry.getKey();
            for(String phone : phone_book) {
                if(!phone.equals(s)) {
                    if(s.equals(phone.substring(0, s.length() - 1))) return false;
                }
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String[] phone_book = {"123","456","789"};
        System.out.println(solution(phone_book));

    }
}
