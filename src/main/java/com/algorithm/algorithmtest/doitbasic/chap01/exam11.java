package com.algorithm.algorithmtest.doitbasic.chap01;

public class exam11 {
    public static void main(String[] args) {

        for(int i = 1; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                if(i == 1 && j == 1) {
                    System.out.print("   |");
                    for(int k = 1; k < 10; k++) {
                        System.out.printf("%3d", k);
                    }
                    System.out.println();
                    System.out.println("---+----------------------------");
                }
                if(j == 1) {
                    System.out.printf("%3d|%3d", i * j, i * j);
                } else System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}
