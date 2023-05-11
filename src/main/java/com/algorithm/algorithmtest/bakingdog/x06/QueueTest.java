package com.algorithm.algorithmtest.bakingdog.x06;

public class QueueTest {
    public int[] queueArr = new int[1000005];
    public int head = 0, tail = 0;
    public void push(int data) {
        queueArr[tail++] = data;
    }
    public void pop() {
        head++;
    }
    public int front() {
        return queueArr[head];
    }
    public int back() {
        return queueArr[tail - 1];
    }
    public static void main(String[] args) {
        QueueTest queueTest = new QueueTest();
        queueTest.push(1);
        queueTest.push(2);
        queueTest.push(3);
        System.out.println(queueTest.front());
        System.out.println(queueTest.back());

        queueTest.pop();
        System.out.println(queueTest.front());
        System.out.println(queueTest.back());
    }
}
