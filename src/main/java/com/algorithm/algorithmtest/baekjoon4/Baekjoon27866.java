package com.algorithm.algorithmtest.baekjoon4;

import java.util.Scanner;

public class Baekjoon27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int num = sc.nextInt();

        System.out.println(word.charAt(num - 1));
    }
}
