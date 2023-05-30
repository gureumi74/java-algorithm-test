package com.algorithm.algorithmtest.bakingdog.x0d;

import java.io.*;
import java.util.*;

public class BOJ15683 {
    static int[][] office, copyOffice, coordinate = new int[8][2];
    static int count, total, location, arr[], cctvCase[] = new int[8], max;
    static int[][] dist = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken()); // 행
        int y = Integer.parseInt(st.nextToken()); // 열
        office = new int[x][y];
        for (int i = 0; i < x; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < y; j++) {
                office[i][j] = Integer.parseInt(st.nextToken());
                // 입력을 받을 때 0인 부분을 전부 세서 모든 사각지대를 구함
                if (office[i][j] == 0) total++;
                else if(office[i][j] != 6) {
                    // 사무실에 있는 1~5번까지의 cctv 종류를 담은 배열
                    cctvCase[location] = office[i][j];
                    // location 변수는 cctv가 몇개 있는지 체크하기위한 변수
                    // coordinate 변수는 cctv의 좌표 배열
                    coordinate[location++] = new int[]{i, j};
                }
            }
        }

        // 백트래킹을 하기 위한 arr 선언 (모든 cctv의 경우의 수)
        arr = new int[location];
        solution(0);
        System.out.println(total - max);

    }

    static void solution(int k) {
        // k가 location 즉, cctv 수만큼 구했을 때 (한 조합을 완성했을 때)
        if(k == location) {
            count = 0;


            // 원본을 카피한 배열
            copyOffice = new int[office.length][];
            for(int i = 0; i < office.length; i++) {
                copyOffice[i] = Arrays.copyOf(office[i], office[i].length);
            }


            for(int i = 0; i < location; i++) {
                // 기준점(cctv의 좌표)
                int dx = coordinate[i][0];
                int dy = coordinate[i][1];

                // 이동 좌표 dist 함수를 이용하여 어디쪽으로 이동할건지 정함
                int nx = dist[arr[i] - 1][0];
                int ny = dist[arr[i] - 1][1];

                if(cctvCase[i] > 0) move(dx, dy, nx, ny);
                if(cctvCase[i] > 1) {
                    if(cctvCase[i] == 2) {
                        // 배열 범위를 넘기지 않도록 %4를 해줌
                        // 이동한 방향 반대 방향도 체크
                        nx = dist[(arr[i] + 1) % 4][0];
                        ny = dist[(arr[i] + 1) % 4][1];
                    } else {
                        // 2가 아니가 3, 4, 5일 경우 시계방향으로 한칸 이동해서 체크
                        nx = dist[arr[i] % 4][0];
                        ny = dist[arr[i] % 4][1];
                    }
                    move(dx, dy, nx, ny);
                }

                if(cctvCase[i] > 3) {
                    // 4, 5일 경우 시계방향으로 한칸 이동해서 체크
                    nx = dist[(arr[i] + 1) % 4][0];
                    ny = dist[(arr[i] + 1) % 4][1];
                    move(dx, dy, nx, ny);
                }

                if(cctvCase[i] > 4) {
                    // 5일경우 한번더 이동해서 총 4방향 모두 확인할 수 있도록 체크
                    nx = dist[(arr[i] + 2) % 4][0];
                    ny = dist[(arr[i] + 2) % 4][1];
                    move(dx, dy, nx, ny);
                }
            }

            if(max < count) {
                max = count;
            }

            return;
        }

        for(int i = 1; i <= 4; i++) {
            if(cctvCase[k] == 2 && i > 2) continue;
            if(cctvCase[k] == 5 && i > 1) continue;
            arr[k] = i;
            solution(k + 1);
        }
    }

    static void move(int dx, int dy, int nx, int ny) {
        while (true) {
            dx += nx;
            dy += ny;
            // dx, dy 가 배열 범위를 넘어가면, 더이상 갈 수 없으니까 break
            if(dx < 0 || dx >= office.length || dy < 0 || dy >= office[0].length) break;
            if(office[dx][dy] == 6) break;
            // dx, dy가 위 조건을 만족하고 0이 아니면 cctv란 소리니까 통과 가능하니까 continue
            if(copyOffice[dx][dy] != 0) continue;
            // 카피한 배열 그 위치에 7을 놓아서 이동했다는 표시 남기기
            copyOffice[dx][dy] = 7;
            // 이동할때마다 count를 증가시킴
            count++;
        }
    }

}

