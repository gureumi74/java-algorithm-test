package com.algorithm.algorithmtest.bakingdog.x01;

import java.util.Scanner;

public class BaekJoon10093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();

        if(num1 == num2 || Math.abs(num1 - num2) == 1) {
            System.out.println(0);
        } else {
            System.out.println(Math.abs(num1 - num2)- 1);
        }
        for(int i = 1; i <= Math.abs(num1 - num2) - 1; i++) {
            System.out.printf("%d ", Math.min(num1, num2) + i);
        }
    }
}
