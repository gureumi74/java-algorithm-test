package com.algorithm.algorithmtest.bakingdog.x0d;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ14891 {
    static int[][] wheel = new int[4][8];
    static int wheelNum, direction;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 4; i++) {
            String[] input = br.readLine().split("");
            for(int j = 0; j < 8; j++) {
                wheel[i][j] = Integer.parseInt(input[j]);
            }
        }

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            wheelNum = Integer.parseInt(st.nextToken()) - 1;
            direction = Integer.parseInt(st.nextToken());
            gear();
        }

        // 최종값 출력
        int result = 0;
        for(int i = 0; i < 4; i++) {
            if(wheel[i][0] == 1) {
                result += 1 << i;
            }
        }
        System.out.println(result);
    }
    static void gear() {
        int[] check = new int[4]; // 톱니바퀴가 어느 방향으로 회전했는지 확인하기 위한 check 변수
        check[wheelNum] = direction; // 첫 회전 방향을 넣어줌
        int left = wheel[wheelNum][6]; // 배열의 6번이 왼쪽 기어와 연결되어 있음
        int right = wheel[wheelNum][2]; // 배열의 2번이 오른쪽 기어와 연결되어 있음
        rotation(wheelNum, direction); // 첫 회전 실행

        // 오른쪽 검사
        for(int i = wheelNum; i < 3; i++) {
            // check[i]가 0이라는 것은 회전하지 않았다는 것이니까 break
            if(check[i] == 0) break;
            // right에 담긴 값이 다음 톱니바퀴 6번과 다를 경우 (서로 다른 극일 경우)
            if(right != wheel[i + 1][6]) {
                // 다음 톱니바퀴를 회전하기 위해 임시 방향 변수 선언
                int tmpDirection;
                // 현재 톱니바퀴가 돌린 방향과 반대로 저장
                if(check[i] == 1) tmpDirection = -1;
                else tmpDirection = 1;
                // 다음 톱니바퀴를 회전하기 전에 원래 값 저장
                right = wheel[i + 1][2];

                // 회전
                rotation(i + 1, tmpDirection);
                // check에 다음 톱니바퀴가 회전했다는 뜻으로 방향을 남겨줌
                check[i + 1] = tmpDirection;
            }
        }

        // 오른쪽과 동일하게 진행
        for(int i = wheelNum; i > 0; i--) {
            if(check[i] == 0) break;
            if(left != wheel[i - 1][2]) {
                int tmpDirection;
                if(check[i] == 1) tmpDirection = -1;
                else tmpDirection = 1;

                left = wheel[i - 1][6];
                rotation(i - 1, tmpDirection);
                check[i - 1] = tmpDirection;
            }
        }


    }
    static void rotation(int num, int gearDirection) {
        // 반시계 방향일 경우
        if(gearDirection == -1) {
            int tmp = wheel[num][0];
            for(int i = 0; i < 7; i++) {
                wheel[num][i] = wheel[num][i + 1];
            }
            wheel[num][7] = tmp;
        }
        // 시계 방향일 경우
        else {
            int tmp = wheel[num][7];
            for(int i = 7; i > 0; i--) {
                wheel[num][i] = wheel[num][i - 1];
            }
            wheel[num][0] = tmp;
        }

//        for(int i = 0; i < 4; i++) {
//            System.out.println(Arrays.toString(wheel[i]));
//        }
//        System.out.println();
    }
}
