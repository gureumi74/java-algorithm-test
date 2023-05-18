package com.algorithm.algorithmtest.bakingdog.x09;

import java.io.*;
import java.util.*;

public class Baekjoon4179false {
    public String solution(int[][] maze, int[] JStart, int[] fireStart) {
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        Queue<ArrayList<Integer>> queue = new LinkedList<>();
        int[][] fireMaze = new int[maze.length][maze[0].length]; // 미로에 불이 퍼지는 시간 계산한 배열
        boolean[][] visit = new boolean[maze.length][maze[0].length]; // 불 BFS를 하기위한 방문 배열

        visit[fireStart[0]][fireStart[1]] = true;
        queue.add(new ArrayList<Integer>(Arrays.asList(fireStart[0], fireStart[1])));
        while (!queue.isEmpty()) {
            ArrayList<Integer> cur = queue.poll();
            for(int i = 0; i < 4; i++) {
                int nx = cur.get(0) + dx[i];
                int ny = cur.get(1) + dy[i];
                if(nx < 0 || nx >= maze.length || ny < 0 || ny >= maze[0].length) continue;
                if(visit[nx][ny] || maze[nx][ny] != 1) continue;
                queue.add(new ArrayList<Integer>(Arrays.asList(nx, ny)));
                visit[nx][ny] = true;
                fireMaze[nx][ny] = fireMaze[cur.get(0)][cur.get(1)] + 1;
            }
        }

        int[][] JMaze = new int[maze.length][maze[0].length]; // 지훈이의 시간 계산한 배열
        visit = new boolean[maze.length][maze[0].length]; // 지훈이의 미로 방문 배열
        visit[JStart[0]][JStart[1]] = true;
        queue.add(new ArrayList<Integer>(Arrays.asList(JStart[0], JStart[1])));
        while (!queue.isEmpty()) {
            ArrayList<Integer> cur = queue.poll();
            for(int i = 0; i < 4; i++) {
                int nx = cur.get(0) + dx[i];
                int ny = cur.get(1) + dy[i];
                // 범위를 넘어가는 것은 탈출에 성공했음을 의미
                if(nx < 0 || nx >= maze.length || ny < 0 || ny >= maze[0].length) {
                    return String.valueOf(JMaze[cur.get(0)][cur.get(1)] + 1);
                }
                if(visit[nx][ny] || maze[nx][ny] != 1 || JMaze[cur.get(0)][cur.get(1)] + 1 >= fireMaze[nx][ny]) continue;
                queue.add(new ArrayList<Integer>(Arrays.asList(nx, ny)));
                visit[nx][ny] = true;
                JMaze[nx][ny] = JMaze[cur.get(0)][cur.get(1)] + 1;
            }
        }

        return "IMPOSSIBLE";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int[][] maze = new int[x][y];

        int[] JStart = new int[2];
        int[] fireStart = new int[2];

        for(int i = 0; i < x; i++) {
            String[] input = br.readLine().split("");
            for(int j = 0; j < y; j++) {
                if (!input[j].equals("#")) {
                    maze[i][j] = 1;
                    if(input[j].equals("J")) {
                        JStart[0] = i;
                        JStart[1] = j;
                    } else if (input[j].equals("F")) {
                        fireStart[0] = i;
                        fireStart[1] = j;
                    }
                }
            }
        }
        Baekjoon4179false result = new Baekjoon4179false();
        bw.write(result.solution(maze, JStart, fireStart));
        bw.close();
    }
}
