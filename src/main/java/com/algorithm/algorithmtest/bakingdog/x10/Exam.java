package com.algorithm.algorithmtest.bakingdog.x10;

public class Exam {
    static int func1(int a) {
        if(a == 0) return a;
        func1(a-1);
        return a;
    }
    public static void main(String[] args) {
        func1(100000);
        System.out.println("DOWN");
    }
}
