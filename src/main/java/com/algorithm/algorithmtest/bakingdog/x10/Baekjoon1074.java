package com.algorithm.algorithmtest.bakingdog.x10;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon1074 {
    static int func(int n, int r, int c) {
        if(n == 0) return 0;
        int half = 1 << (n - 1);
        if(r < half && c < half) return func(n - 1, r, c);
        if(r < half && c >= half) return half * half + func(n - 1, r, c -half);
        if(r >= half && c < half) return 2 * half * half + func(n - 1, r - half, c);
        return 3 * half * half + func(n - 1, r - half, c - half);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        bw.write(String.valueOf(func(N, r, c)));
        bw.close();
    }
}
