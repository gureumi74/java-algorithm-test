package com.algorithm.algorithmtest.bakingdog.x04;

public class Traverse {
    static int MX = 1000005;
    static int[] data = new int[MX], pre = new int[MX], next = new int[MX];
    static int unused;
    public static void main(String[] args) {
        data[0] = -1; data[1] = 65; data[2] = 13; data[4] = 21; data[5] = 17;
        pre[0] = -1; pre[1] = 2; pre[2] = 0; pre[4] = 1; pre[5] = 4;
        next[0] = 2; next[1] = 4; next[2] = 1; next[4] = 5; next[5] = -1;
        unused = 6;

        insert(30, 3);

        int cur = next[0];
        while (cur != -1) {
            System.out.println(data[cur]);
            cur = next[cur];
        }
        System.out.println("\n");
    }
    public static void insert(int insertData, int addr) {
        data[unused] = insertData;
        pre[unused] = addr;
        next[unused] = next[addr];
        if(next[addr] != -1) pre[next[addr]] = unused;
        next[addr] = unused;
        unused++;
    }
    public static void erase(int addr) {
        next[pre[addr]] = next[addr];
        if(next[addr] != -1) pre[next[addr]] = pre[addr];
    }
}
