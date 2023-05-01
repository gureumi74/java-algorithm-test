package com.algorithm.algorithmtest.bakingdog.x01;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon2441 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for(int i = 0; i < input; i++) {
            System.out.printf(" ".repeat(i));
            System.out.println("*".repeat(input - i));

        }
    }
}
