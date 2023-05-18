package com.algorithm.algorithmtest.baekjoon4.bj5;

import java.math.BigInteger;
import java.util.Scanner;

public class Baekjoon27902 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        BigInteger two = new BigInteger("2");  // BigInteger 클래스로 2를 생성합니다.
        BigInteger result = two.pow(n);       // 2의 n 제곱을 계산합니다.

        if(result.toString().length() > 4300) {
            System.out.println("");
        } else {
            System.out.println(result);
        }
    }
}
