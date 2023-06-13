package com.algorithm.algorithmtest.bakingdog.x0d;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ11559 {
    // 뿌요뿌요
    static String bord[][] = new String[12][6];
    static int[][] dist = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // 상하좌우
    static Queue<Pair> que = new LinkedList<>(); // BFS를 하기 위한 큐
    static int count; // 최종 답
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 12; i++) {
            String[] input = br.readLine().split("");
            for(int j = 0; j < 6; j++) {
                bord[i][j] = input[j];
            }
        }

        // BFS를 통해서 4개 이상이 붙어있을 때 count를 증가시키고 만약 더이상 BFS를 돌려도
        // count가 증가되지 않는다면 break;
        while (true) {
            if(BFS()) {
                count++;
                fall();
            }
            else break;
        }

        System.out.println(count);
    }

    static boolean BFS() {
        // 방문배열
        boolean[][] visit = new boolean[12][6];
        boolean check = false;

        // 기존 BFS 했던 과정과 동일
        for(int i = 0; i < 12; i++) {
            for(int j = 0; j < 6; j++) {
                // 이미 방문했다는 것은 다른 색깔이 이미 터졌다는 뜻이기 때문에 해당 부분도 continue
                if(visit[i][j] || bord[i][j].equals(".")) continue;
                Queue<Pair> countQue = new LinkedList<>(); // 4개 이상일 경우 해당 좌표를 . 로 바꾸기 위해 선언
                que.offer(new Pair(i, j));
                // 상하좌우 붙어있는게 4개 이상일 경우 해당 블록을 터트려야하니까
                // 좌표들을 돌면서 담아놓는 countQue 생성
                // 근데 좌표만 담는거라 que말고 그냥 배열이나 Arraylist 사용해도 될듯
                countQue.offer(new Pair(i, j));
                visit[i][j] = true;
                String tmp = bord[i][j];

                while (!que.isEmpty()) {
                    Pair cur = que.poll();
                    for(int k = 0; k < 4; k++) {
                        int nx = cur.x + dist[k][0];
                        int ny = cur.y + dist[k][1];
                        if(nx < 0 || nx >= bord.length || ny < 0 || ny >= bord[0].length) continue;
                        if(visit[nx][ny] || !bord[nx][ny].equals(tmp)) continue;
                        visit[nx][ny] = true;
                        que.add(new Pair(nx, ny));
                        countQue.add(new Pair(nx, ny));
                    }
                }

                // countQue가 4개 이상일 경우 check를 true로 바꿔주고, 해당 부분을 터트렸으니까 .으로 바꿔줌
                if(countQue.size() > 3) {
                    check = true;
                    int size = countQue.size();
                    for(int k = 0; k < size; k++) {
                        Pair cur = countQue.poll();
                        bord[cur.x][cur.y] = ".";
                    }
                }

            }
        }
        return check;

    }
    static void fall() {
        for(int j = 0; j < 6; j++) {
            for(int i = 11; i > 0; i--) {
                if(!bord[i][j].equals(".")) continue;
                int l = 1;
                while (l != i && bord[i - l][j].equals(".")) l++;

                bord[i][j] = bord[i - l][j];
                bord[i - l][j] = ".";
            }
        }

//        System.out.println("떨어지기");
//        for(int i = 0; i < 12; i++) {
//            System.out.println(Arrays.toString(bord[i]));
//        }
    }
    static class Pair {
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

