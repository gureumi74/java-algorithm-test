package com.algorithm.algorithmtest.bakingdog.x01;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dice = new int[3];
        for(int i = 0; i < 3; i++) {
            dice[i] = sc.nextInt();
        }

        Arrays.sort(dice);
        int answer = 0;
        if(dice[0] == dice[1] && dice[1] == dice[2]) {
            System.out.println(10000 + dice[0] * 1000);
        } else if (dice[0] != dice[1] && dice[0] != dice[2] && dice[1] != dice[2]) {
            System.out.println(dice[2] * 100);
        } else if (dice[0] == dice[1]) {
            System.out.println(1000 + dice[0] * 100);
        } else {
            System.out.println(1000 + dice[1] * 100);
        }
    }
}
