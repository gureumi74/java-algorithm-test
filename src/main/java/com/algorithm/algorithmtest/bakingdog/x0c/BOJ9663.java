package com.algorithm.algorithmtest.bakingdog.x0c;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9663 {
    static int N, count;
    static boolean[] isused1, isused2, isused3;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        // 퀸과 같은 열
        isused1 = new boolean[N];
        // 퀸과 좌측 하단, 우측 상단을 연결하는 같은 대각선에 있는 열
        isused2 = new boolean[2 * N - 1];
        // 퀸과 우측 하단, 좌측 상단을 연결하는 같은 대각선에 있는 열
        isused3 = new boolean[2 * N - 1];
        func(0);
        System.out.println(count);
    }
    public static void func(int cur) {
        if(cur == N) {
            count++;
            return;
        }

        for(int i = 0; i < N; i++) {
            if(isused1[i] || isused2[i + cur] || isused3[cur - i + N -1]) continue;
            isused1[i] = true;
            isused2[i + cur] = true;
            isused3[cur - i + N - 1] = true;
            func(cur + 1);
            isused1[i] = false;
            isused2[i + cur] = false;
            isused3[cur - i + N - 1] = false;
        }
    }
}
