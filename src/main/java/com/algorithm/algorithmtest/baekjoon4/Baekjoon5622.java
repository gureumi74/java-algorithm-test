package com.algorithm.algorithmtest.baekjoon4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Baekjoon5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();
        int sum = 0;


        for(int i = 0; i < input.length; i++) {
            switch (input[i]) {
                case 'A', 'B', 'C' -> sum += 3;
                case 'D', 'E', 'F' -> sum += 4;
                case 'G', 'H', 'I' -> sum += 5;
                case 'J', 'K', 'L' -> sum += 6;
                case 'M', 'N', 'O' -> sum += 7;
                case 'P', 'Q', 'R', 'S' -> sum += 8;
                case 'T', 'U', 'V' -> sum += 9;
                default -> sum += 10;
            }
        }
        System.out.println(sum);
    }
}
