package com.algorithm.algorithmtest.bakingdog.x07;

import java.util.Arrays;

public class DequeTest {
    int MX = 20;
    public int[] arr = new int[2 * MX + 1];
    public int head = MX, tail = MX;
    public void push_front(int num) {
        arr[--head] = num;
    }
    public void push_back(int num) {
        arr[tail++] = num;
    }
    public void pop_front() {
        head++;
    }
    public void pop_back() {
        tail--;
    }
    public int front() {
        return arr[head];
    }
    public int back() {
        return arr[tail - 1];
    }
    public static void main(String[] args) {
        DequeTest dequeTest = new DequeTest();
        dequeTest.push_front(10);
        dequeTest.push_back(50);
        dequeTest.push_front(20);
        System.out.println(Arrays.toString(dequeTest.arr));

        dequeTest.pop_front();
        dequeTest.pop_back();
        System.out.println(Arrays.toString(dequeTest.arr));

        System.out.println(dequeTest.front());
        System.out.println(dequeTest.back());
    }
}
