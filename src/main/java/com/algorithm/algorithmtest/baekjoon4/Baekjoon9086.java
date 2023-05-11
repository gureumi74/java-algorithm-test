package com.algorithm.algorithmtest.baekjoon4;

import java.io.*;

public class Baekjoon9086 {
    public String solution(String input) {
        return String.format("%c%c", input.charAt(0), input.charAt(input.length() - 1));
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNum = Integer.parseInt(br.readLine());

        Baekjoon9086 result = new Baekjoon9086();
        for(int i = 0; i < caseNum; i++) {
            bw.write(result.solution(br.readLine()) + "\n");
        }
        bw.close();
    }
}
