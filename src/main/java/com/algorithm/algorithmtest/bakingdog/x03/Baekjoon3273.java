package com.algorithm.algorithmtest.bakingdog.x03;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sizeN = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int xNum = Integer.parseInt(br.readLine());
        int[] checkNum = new int[1000000];
        int count = 0;

        for(int i = 0; i < sizeN; i++) {
            int n = Integer.parseInt(st.nextToken());
            if(xNum > n && checkNum[xNum - n] == 1) {
                count++;
            }
            checkNum[n] = 1;
        }
        bw.write(String.valueOf(count));
        bw.close();
    }
}
