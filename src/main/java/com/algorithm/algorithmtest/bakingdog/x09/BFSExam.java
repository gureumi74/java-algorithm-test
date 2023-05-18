package com.algorithm.algorithmtest.bakingdog.x09;


import java.nio.file.attribute.AclEntryType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFSExam {
    public static void main(String[] args) {
        int[][] board = new int[10][10];
        boolean[][] visit = new boolean[10][10];
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        Queue<ArrayList<Integer>> queue = new LinkedList<>();
        visit[0][0] = true;
        queue.add(new ArrayList(Arrays.asList(0, 0)));

        while (!queue.isEmpty()) {
            ArrayList<Integer> cur = queue.poll();

            for(int i = 0; i < 4; i++) {
                int nx = cur.get(0) + dx[i];
                int ny = cur.get(1) + dy[i];
                if (nx < 0 || nx >= board[i].length || ny < 0 || ny >= board.length) continue;
                if(visit[nx][ny] || board[nx][ny] != 1) continue;
                visit[nx][ny] = true;
                queue.add(new ArrayList<Integer>(Arrays.asList(nx, ny)));
            }
        }
    }
}
