package com.algorithm.algorithmtest.baekjoon4;

import java.io.*;

public class Baekjoon2675 {
    public String solution(int num, String input) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < input.length(); i++) {
            for(int j = 0; j < num; j++) {
                sb.append(input.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNum = Integer.parseInt(br.readLine());

        Baekjoon2675 result = new Baekjoon2675();
        for(int i = 0; i < caseNum; i++) {
            String[] input = br.readLine().split(" ");
            bw.write(result.solution(Integer.parseInt(input[0]), input[1]) + "\n");
        }
        bw.close();
    }
}
