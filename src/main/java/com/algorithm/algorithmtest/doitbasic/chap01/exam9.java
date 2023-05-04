package com.algorithm.algorithmtest.doitbasic.chap01;

import java.util.Scanner;

public class exam9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a값 : ");
        int a = sc.nextInt();
        int b = 0;

        do {
            System.out.print("b값 : ");
            b = sc.nextInt();
            if(a >= b) {
                System.out.println("a보다 큰 값을 입력하세요!");
            }
        } while (a >= b);

        System.out.printf("b - a는 %d입니다.", b - a);
    }
}
