package com.algorithm.algorithmtest.programmers.basic;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> dwarf = new ArrayList();
        int sum = 0;
        for(int i = 0; i < 9; i++) {
            dwarf.add(Integer.parseInt(br.readLine()));
            sum += dwarf.get(i);
        }

        sum -= 100;

        boolean flag = false;
        for(int i = 0; i < 8; i++) {
            for(int j = i + 1; j < 9; j++) {
                if(dwarf.get(i) + dwarf.get(j) == sum) {
                    dwarf.remove(dwarf.get(i));
                    dwarf.remove(dwarf.get(j - 1));
                    flag = true;
                    break;
                }
            }
            if(flag) break;
        }

        dwarf.sort(Comparator.naturalOrder());

        for(int i = 0; i < dwarf.size(); i++) {
            bw.write(String.format("%d\n", dwarf.get(i)));
        }

        bw.close();


    }
}
