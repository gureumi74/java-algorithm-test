package com.algorithm.algorithmtest.bakingdog.x07;

import java.io.*;
import java.util.*;

public class Baekjoon5430 {
    private static Deque<String> reverseDeque(Deque<String> deque) {
        Deque<String> reversedDeque = new ArrayDeque<>();
        while(!deque.isEmpty()) {
            reversedDeque.addLast(deque.pollLast());
        }
        return reversedDeque;
    }
    public static String solution(String input, int arrNum, String inputArr) {
        if(arrNum == 0) {
            return "error";
        }
        String[] arrStr = inputArr.replace("[", "").replace("]", "").split(",");
        Deque<String> deque = new ArrayDeque<>(Arrays.asList(arrStr));

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(c == 'R') {
                if(!deque.isEmpty()) deque = reverseDeque(deque);
                else {
                    return "error";
                }
            } else {
                if(!deque.isEmpty()) deque.pollFirst();
                else return "error";
            }
        }

        return deque.toString().replace(" ", "");
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int caseNum = Integer.parseInt(br.readLine());
        for(int i = 0; i < caseNum; i++) {
            String input = br.readLine();
            int arrNum = Integer.parseInt(br.readLine());
            String inputArr = br.readLine();

            bw.write(solution(input, arrNum, inputArr) + "\n");
        }
        bw.close();
    }
}
