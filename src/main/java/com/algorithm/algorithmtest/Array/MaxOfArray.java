package com.algorithm.algorithmtest.Array;

import java.util.Scanner;

public class MaxOfArray {
    static int maxOF(int[] arr) {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수 : ");
        int num = sc.nextInt();

        int[] height = new int[num]; // 요솟수가 num인 배열 생성
        for(int i = 0; i < num; i++) {
            System.out.printf("height[%d] : ", i);
            height[i] = sc.nextInt();
        }

        System.out.printf("최댓값은 %d 입니다.", maxOF(height));
    }
}
