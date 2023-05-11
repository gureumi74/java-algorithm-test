package com.algorithm.algorithmtest.baekjoon4;

import java.io.*;

public class Baekjoon11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = "hello";
        while (str != null) {
            str = br.readLine();
            bw.write(str + "\n");
        }
        br.close();
        bw.close();
    }
}
