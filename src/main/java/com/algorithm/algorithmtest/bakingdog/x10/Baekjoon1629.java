package com.algorithm.algorithmtest.bakingdog.x10;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon1629 {
    public static long pow(int A, int B, int C) {
        if(B == 1) return A % C;
        // A의 B/2제곱을 구하기 위헤 함수 호출
        long val = pow(A, B/2, C);
        // 그 결과값을 제곱을 함으로 최종적으로 내가 구하고자하는 값에 도달
        val = val * val % C;
        // B가 짝수일 경우 그냥 반환, 홀수 일 경우 한 번 더 곱해서 반환
        if(B % 2 == 0) return val;
        return val * A % C;

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        bw.write(String.valueOf(pow(A, B, C)));
        bw.close();


    }
}
