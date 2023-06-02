package com.algorithm.algorithmtest.bakingdog.x0d;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class BOJ18808 {
    static int[][] note, sticker;
    static int N, M, K, stickerN, stickerM, count, result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 세로의 길이
        M = Integer.parseInt(st.nextToken()); // 가로의 길이
        K = Integer.parseInt(st.nextToken()); // 스티커의 개수
        note = new int[N][M];
        for(int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            stickerN = Integer.parseInt(st.nextToken()); // 스티커의 세로 길이
            stickerM = Integer.parseInt(st.nextToken()); // 스티커의 가로 길이
            sticker = new int[stickerN][stickerM];
            // 입력받은 스티커 정보 배열에 저장
            // 스티커를 붙였을 때 스티커의 크기를 나중에 답에 더해야하기 때문에 count 초기화
            count = 0;
            for(int j = 0; j < stickerN; j++) {
                st = new StringTokenizer(br.readLine());
                for(int k = 0; k < stickerM; k++) {
                    sticker[j][k] = Integer.parseInt(st.nextToken());
                    if(sticker[j][k] == 1) count++;
                }
            }
            // 함수 실행
            noteCheck();
            // 스티커를 붙였을 때 정답에 count를 더해준다.
            result += count;
        }

        // 총 스티커의 크기 출력
        System.out.println(result);
    }

    static void noteCheck() {
        // 스티커를 붙이지 못할 경우 90도로 회전해야 하므로 최대 4번 실행
        for(int k = 0; k < 4; k++) {
            // 전체 크기에서 스티커의 크기만큼만 돌림
            for(int i = 0; i <= N - stickerN; i++) {
                for(int j = 0; j <= M - stickerM; j++) {
                    // 현재 좌표를 기준으로 스티커를 붙이기에 성공했을 때 리턴
                    if(sticking(i, j)) return;
                }
            }

            // 스티커를 붙이지 못했을 때 90도로 회전
            rotation90();
        }

        // 여기까지 왔는데도 붙이지 못했으면 답에 추가할 수 없으니까 count를 다시 0으로 초기화
        count = 0;
    }
    // 스티커 붙이기 메소드
    static boolean sticking(int x, int y) {
        // 시작점을 기준점으로 잡고 스티커의 크기만큼 실행
        for(int i = 0; i < stickerN; i++) {
            for(int j = 0; j < stickerM; j++) {
                // 만약 스티커 부분도 1이고 노트북의 시작점을 기준으로 같은 부분이 1일땐 스티커를 붙일 수 없는 경우니까 false 리턴
                if(sticker[i][j] == 1 && note[i + x][j + y] == 1) return false;
            }
        }

        // 여기까지 왔을 경우 스티커를 붙일 수 있으니까 note 배열에 복사
        // 배열 자체를 복사하는 함수를 썼었는데 전에 붙였던 스티커 부분이 현재 붙이려는
        // 스티커 배열 그 자체를 복사하니까 0으로 바껴서 스티커를 붙이는 부분에만 1로 바꿔줌
        for(int i = 0; i < stickerN; i++) {
            for(int j = 0; j < stickerM; j++) {
                if(sticker[i][j] == 1) note[i + x][j + y] = 1;
            }
        }

        // 스티커 붙이기를 성공했으니 true 반환
        return true;
    }
    // 90도 회전
    static void rotation90() {
        // 90도 회전을 위한 스티커 배열 카피
        int[][] tmp = new int[stickerN][stickerM];
        for(int i = 0; i < stickerN; i++) {
            tmp[i] = Arrays.copyOf(sticker[i], sticker[i].length);
        }
        // 스티커의 크기가 바꼈으니까 복사한 배열의 가로 세로 값을 바꿔서 넣어줌
        stickerN = tmp[0].length;
        stickerM = tmp.length;

        // 스티커 배열을 회전한 크기로 다시 선언
        sticker = new int[stickerN][stickerM];
        for(int i = 0; i < stickerM; i++) {
            for(int j = 0; j < stickerN; j++) {
                // 회전하고 난 후의 i가 회전하기 전 j
                // 회전하고 난 후의 j가 회전하기 전 행 - 1 - i
                sticker[j][stickerM - 1 - i] = tmp[i][j];
            }
        }
    }
}

