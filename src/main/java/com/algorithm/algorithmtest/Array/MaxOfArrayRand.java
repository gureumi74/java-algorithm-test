package com.algorithm.algorithmtest.Array;

import javafx.scene.paint.RadialGradient;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
    static int maxOf(int[] arr) {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수 : ");
        int num = sc.nextInt();

        int[] height = new int[num];

        System.out.println("킷값은 아래와 같습니다.");
        for(int i = 0; i < num; i++) {
            height[i] = 100 + random.nextInt(90); // 100 + 1~90까지의 난수
            System.out.printf("height : %d\n", height[i]);
        }

        System.out.printf("최댓값은 %d 입니다.", maxOf(height));
    }
}
