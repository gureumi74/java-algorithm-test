package com.algorithm.algorithmtest.bakingdog.x09;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon10026_2 {
    public static void main(String[] args) throws IOException {
        // 입출력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[][] board = new String[n][n];

        // 적록색약이 보는 그림 배열을 따로 저장
        String[][] boardCopy = new String[n][n];
        for(int i = 0; i < n; i++) {
            String[] s = br.readLine().split("");
            for(int j = 0; j < n; j++) {
                // 입력이 그린일 경우 적록색약 배열에 R로 변경해서 넣어줌
                if(s[j].equals("G")) boardCopy[i][j] = "R";
                else boardCopy[i][j] = s[j];
                board[i][j] = s[j];
            }
        }

        Baekjoon10026_2 result = new Baekjoon10026_2();
        // BFS 를 두 번 돌려서 두 값을 구함
        bw.write(result.BFS(board) + " " + result.BFS(boardCopy));
        bw.close();
    }
    public int BFS(String[][] board) {
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        boolean[][] visit = new boolean[board.length][board.length];
        Queue<Pair> queue = new LinkedList<>();
        int count = 0;

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                // 매 시작점은 한 구역을 다 돌고나서 그 다음 구역이니까 방문하지 않은 곳부터 시작
                if(visit[i][j]) continue;

                // 방문하지 않았다는 것은 새로운 구역이니까 count를 증가
                count++;

                visit[i][j] = true;
                queue.offer(new Pair(i, j));
                while (!queue.isEmpty()) {
                    Pair cur = queue.poll();
                    for(int k = 0; k < 4; k++) {
                        int nx = cur.x + dx[k];
                        int ny = cur.y + dy[k];
                        if(nx < 0 || nx >= board.length || ny < 0 || ny >= board.length) continue;

                        // 이미 방문한 곳이거나 현재 위치가 전 위치의 글자와 같지 않으면 넘어감
                        if(visit[nx][ny] || !board[nx][ny].equals(board[i][j])) continue;
                        visit[nx][ny] = true;
                        queue.offer(new Pair(nx, ny));
                    }
                }
            }
        }
        return count;
    }
    public static class Pair {
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
