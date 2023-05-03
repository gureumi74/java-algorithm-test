package com.algorithm.algorithmtest.doit.index3;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.StringTokenizer;

public class Baekjoon11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int suNo = Integer.parseInt(st.nextToken()); // 숫자의 개수
        int quizNo = Integer.parseInt(st.nextToken()); // 질의 개수
        long[] sectionSum = new long[suNo + 1]; // 구간 합 배열
        st = new StringTokenizer(br.readLine());
        // 구간 합 배열 생성
        for(int i = 1; i <= suNo; i++) {
            sectionSum[i] = sectionSum[i - 1] + Integer.parseInt(st.nextToken());
        }
        // i - j 구간의 합 출력
        for(int k = 0; k < quizNo; k++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            bw.write(String.format("%d\n", sectionSum[j] - sectionSum[i - 1]));
        }
        bw.close();
    }
}
