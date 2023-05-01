package com.algorithm.algorithmtest.bakingdog.x01;

import java.util.Scanner;

public class BaekJoon2443 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int count = 1;
        for(int i = 1; i < input; i++) {
            System.out.printf(" ".repeat(input - i));
            System.out.println("*".repeat(2 * i - 1));
        }
        for(int i = 1; i <= input; i++) {
            System.out.printf(" ".repeat(i - 1));
            System.out.println("*".repeat(2 * input - count));
            count += 2;
        }
    }
}
