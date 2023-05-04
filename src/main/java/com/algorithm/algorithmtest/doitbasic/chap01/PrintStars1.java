package com.algorithm.algorithmtest.doitbasic.chap01;

import java.util.Scanner;

public class PrintStars1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*를 n개 출력하되 w개마다 줄을 바꿔서 출력합니다.");

        System.out.print("n값 : ");
        int n = sc.nextInt();

        System.out.print("w값 : ");
        int w = sc.nextInt();

        while (n > 0) {
            if(n > w) System.out.println("*".repeat(w));
             else System.out.println("*".repeat(n));
            n -= w;
        }
    }
}
