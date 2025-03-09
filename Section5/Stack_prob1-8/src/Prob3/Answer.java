package Prob3;

import java.util.*;

public class Answer {
    public int solution(int[][] board, int[] move) {
        int answer = 0;
        Stack<Integer>stack = new Stack<>();

        for(int pos : move) {
            for(int i = 0;i<board.length;i++) {
                int tmp = board[i][pos-1];
                board[i][pos-1] = 0;
                if(tmp != 0) {
                    if(!stack.isEmpty() && tmp == stack.peek()) {
                        stack.pop();
                        answer += 2;
                    }
                    else {
                        stack.push(tmp);
                    }
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Answer T = new Answer();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][]board = new int[n][n];

        for(int i = 0;i<n;i++) {
            for(int j = 0;j<n;j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int m = sc.nextInt();
        int[]move = new int[m];
        for(int i = 0;i<m;i++) move[i] = sc.nextInt();

        System.out.print(T.solution(board,move));
    }
}
