package com.algorithm.algorithmtest.bakingdog.x05;

public class StackExam {
    static int[] data = new int[1000005];
    static int pos = 0;

    public static void main(String[] args) {
        push(3);
        System.out.println(data[0]);
        push(4);
        System.out.println(data[0]);
        System.out.println(data[1]);
        pop();
        System.out.println(data[0]);
        System.out.println(data[1]);

    }
    public static void push(int n) {
        data[pos++] = n;
    }
    public static void pop() {
        pos--;
    }
    public static int top() {
        return data[pos - 1];
    }
}
