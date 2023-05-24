package com.algorithm.algorithmtest.bakingdog.x0c;

import java.io.*;

public class BOJ9663_2 {
    static int n, count;
    static boolean[] check1, check2, check3;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        check1 = new boolean[n];
        check2 = new boolean[2 * n];
        check3 = new boolean[2 * n];
        func(0);
        System.out.println(count);
    }
    static void func(int k) {
        if(k == n) {
            count++;
            return;
        }

        for(int i = 0; i < n; i++) {
            if(check1[i] || check2[k + i] || check3[k - i + n - 1]) continue;
            check1[i] = true;
            check2[k + i] = true;
            check3[k - i + n - 1] = true;
            func(k + 1);
            check1[i] = false;
            check2[k + i] = false;
            check3[k - i + n - 1] = false;
        }
    }
}
