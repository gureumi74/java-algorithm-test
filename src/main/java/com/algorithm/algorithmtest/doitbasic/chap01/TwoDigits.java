package com.algorithm.algorithmtest.doitbasic.chap01;

import java.util.Scanner;

public class TwoDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("2자리의 양수를 입력하세요.");
        int no;

        do {
            System.out.print("no값 : ");
            no = sc.nextInt();
        } while (no < 10 || no > 99);

        System.out.printf("변수 no값은 %d이 되었습니다.", no);
    }
}
