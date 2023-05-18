package com.algorithm.algorithmtest.bakingdog.x09;

import java.io.*;
import java.util.*;

public class Baekjoon4179 {
    public static void main(String[] args) throws IOException {
        // 입출력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        String[][] maze = new String[R][C];
        for(int i = 0; i < R; i++) {
            String[] s = br.readLine().split("");
            for(int j = 0; j < C; j++) {
                maze[i][j] = s[j];
            }
        }

        Baekjoon4179 result = new Baekjoon4179();
        bw.write(result.BFS(maze));
        bw.close();
    }
    public String BFS(String[][] maze) {
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        // 불의 퍼지는 시간을 담는 배열
        int[][] distFire = new int[maze.length][maze[0].length];
        // 지훈이의 탈출 시간을 담은 배열
        int[][] distJ = new int[maze.length][maze[0].length];

        // 불의 시작 지점
        Pair fireStart = null;
        // 지훈이 시작 지점
        Pair JStart = null;

        // BFS를 하기위해 시작 지점 구하기
        for(int i = 0; i < maze.length; i++) {
            for(int j = 0; j < maze[0].length; j++) {
                if(maze[i][j].equals("J")) {
                    JStart = new Pair(i, j);
                    distJ[i][j] = 1;
                    distFire[i][j] = Integer.MAX_VALUE;
                } else if(maze[i][j].equals("F")) {
                    fireStart = new Pair(i, j);
                    // 나중에 이동 경로에 #(벽)이 있으면 못가도록 할건데 불의 시작위치는 #이 아니니까 불의 시작 위치로도 가게 됨
                    // 불의 위치로는 갈 수 없으니 좌표만 구하고 벽으로 바꿔줌
                    maze[i][j] = "#";
                    distFire[i][j] = 1;
                } else if(maze[i][j].equals(".")) {
                    // 그 칸에 지훈이 이동 횟수 >= 불의 이동 횟수일 경우 움직이지 않도록
                    // 초기 값을 MAX 값으로 설정
                    distFire[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        Queue<Pair> queue = new LinkedList();
        queue.offer(fireStart);

        // 불의 BFS
        while (!queue.isEmpty()) {
            Pair cur = queue.poll();
            for(int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];
                if (nx < 0 || nx >= maze.length || ny < 0 || ny >= maze[0].length) continue;
                if(distFire[nx][ny] != Integer.MAX_VALUE || maze[nx][ny].equals("#")) continue;
                queue.offer(new Pair(nx, ny));
                distFire[nx][ny] = distFire[cur.x][cur.y] + 1;
            }
        }

        // 어차피 큐에 아무것도 안들어있으니까 지훈이의 BFS를 큐 재사용
        queue.offer(JStart);

        // 지훈이의 BFS
        while (!queue.isEmpty()) {
            Pair cur = queue.poll();
            for(int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];

                // 범위를 벗어났다는 것은 탈출했다는 것이니까 전 값을 바로 리턴해줌
                if (nx < 0 || nx >= maze.length || ny < 0 || ny >= maze[0].length) {
                    return String.valueOf(distJ[cur.x][cur.y]);
                }

                // 그 전값에서 +1 한게 fire의 퍼지는 시간보다 같거나 크면 갈 수 없는 길
                if(distJ[nx][ny] > 0 || maze[nx][ny].equals("#") || distJ[cur.x][cur.y] + 1 >= distFire[nx][ny]) continue;
                distJ[nx][ny] = distJ[cur.x][cur.y] + 1;
                queue.offer(new Pair(nx, ny));
            }
        }

        return "IMPOSSIBLE";
    }
    public void print(String[][] maze, int[][] distJ, int[][] distFire) {
        for(int i = 0; i < maze.length; i++) {
            System.out.println(Arrays.toString(distFire[i]));
        }

        System.out.println("--------------------");

        for(int i = 0; i < maze.length; i++) {
            System.out.println(Arrays.toString(distJ[i]));
        }
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
