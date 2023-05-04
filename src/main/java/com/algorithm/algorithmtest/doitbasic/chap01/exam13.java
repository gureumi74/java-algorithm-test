package com.algorithm.algorithmtest.doitbasic.chap01;

import java.util.Scanner;

public class exam13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정사각형을 출력합니다.");
        System.out.print("변의 길이 : ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.println("*".repeat(n));
        }
    }
}
