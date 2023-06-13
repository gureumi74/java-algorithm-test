package com.algorithm.algorithmtest.bakingdog.x0d;

import java.io.*;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ12100 {
    static int bord[][], copy[][], N, arr[] = new int[5];
    static int[][] dist = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // 상 하 좌 우

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        bord = new int[N][N];
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                bord[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        game(0);
    }
    static void game(int k) {
        if(k == 5) {
            copy = new int[N][N];
            for(int i = 0; i < N; i++) {
                copy[i] = Arrays.copyOf(bord[i], N);
            }
            for(int i = 0; i < arr.length; i++) {

            }
        }
    }
    static void move() {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(copy[i][j] == 0) continue;
//                if(!stack.isEmpty() && stack.peek() == copy[i][j])

            }
        }
    }
}
