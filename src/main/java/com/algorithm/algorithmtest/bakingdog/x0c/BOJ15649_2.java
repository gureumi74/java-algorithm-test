package com.algorithm.algorithmtest.bakingdog.x0c;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ15649_2 {
    static int n, m, arr[];
    static boolean check[];
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        // 0 ~ n - 1 까지 보지 않고 0은 걍 버리고 1 ~ n 까지 보기 위해 n + 1 해줌
        check = new boolean[n + 1];
        func(0);
        System.out.println(sb);
        br.close();
    }
    static void func(int k) {
        if(k == m) {
            for(int i = 0; i < m; i++) sb.append(arr[i]).append(" ");
            sb.append("\n");
            return;
        }

        for(int i = 1; i <= n; i++) {
            if(!check[i]) {
                arr[k] = i;
                check[i] = true;
                func(k + 1);
                check[i] = false;
            }
        }
    }
}
