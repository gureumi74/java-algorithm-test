package com.algorithm.algorithmtest.bakingdog.x06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon2164 {
    public int solution(int input) {
        Queue<Integer> queue = new LinkedList();
        for (int i = 1; i <= input; i++) {
            queue.add(i);
        }
        while (queue.size() != 1) {
            queue.poll();
            queue.add(queue.poll());
        }

        return queue.poll();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        Baekjoon2164 result = new Baekjoon2164();
        System.out.println(result.solution(input));
    }
}
