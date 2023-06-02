package com.algorithm.algorithmtest.algorithm.array;

import java.util.Scanner;

public class CardConv {
    static int cardConv(int x, int r, char[] d) {
        int digit = 0; // 변환 후의 자릿수
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        while (x != 0) {
            d[digit++] = dchar.charAt(x % r);
            x /= r;
        }

        // 역순으로 정렬
        for(int i = 0; i < digit / 2; i++) {
            char t = d[i];
            d[i] = d[digit - i - 1];
            d[digit - i - 1] = t;
        }

        return digit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] cno = new char[32]; // 변환 후 각 자라의 숫자를 넣어 주는 문자 배열
        int no = sc.nextInt(); // 변환하는 음이 아닌 정수
        int cd = sc.nextInt(); // 기수

        int dno = cardConv(no, cd, cno);
        for(int i = 0; i < dno; i++) {
            System.out.print(cno[i]);
        }

    }
}
