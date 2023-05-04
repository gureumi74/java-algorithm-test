package com.algorithm.algorithmtest.doitbasic.chap01;

import java.util.Scanner;

public class SumVerbose1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n값 : ");
        int n = sc.nextInt();
        int sum = n;

        for(int i = 1; i < n; i++) {
            System.out.printf("%d + ", i);
            sum += i;
        }
        System.out.printf("%d = %d", n, sum);

    }
}
