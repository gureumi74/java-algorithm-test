package com.algorithm.algorithmtest.bakingdog.x0c;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class BOJ15666 {
    static int N, M, arr[], input[];

    // 중복값을 받지 않기 위해 hashset사용
    static LinkedHashSet<String> hs = new LinkedHashSet();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];
        input = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(input);
        solution(0, 0);

        for (String s : hs) {
            System.out.println(s);
        }
    }
    static void solution(int k, int start) {
        // 어차피 현재 값보다 작은 수는 못오니까 방문 배열 x
        if (k == M) {
            StringBuilder sb = new StringBuilder();
            for (int val : arr) {
                sb.append(val + " ");
            }
            hs.add(sb.toString());
            return;
        }

        for (int i = start; i < N; i++) {
            arr[k] = input[i];
            solution(k + 1, i);
            // 그 전값보다는 큰 값만 나와야하니까 start 증가
            start++;
        }
    }
}
