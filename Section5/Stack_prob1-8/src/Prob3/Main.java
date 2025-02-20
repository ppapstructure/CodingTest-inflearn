package Prob3;

import java.util.*;

public class Main {
    public int solution(int n, int m, int[][] board, int[] move) {
        int answer = 0;
        Stack<Integer>stack = new Stack<>();


        for(int i = 0;i<m;i++) {
            int col = move[i];
            for(int row = 1;row<n+1;row++) {
                if(board[row][col] != 0) {
//                    System.out.println(board[row][col]);
                    if(!stack.isEmpty() && board[row][col] == stack.peek()) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[row][col]);
                    }
                    board[row][col] = 0;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n+1][n+1];

        for(int i = 1;i<n+1;i++) {
            for(int j = 1;j<n+1;j++) {
                board[i][j] = sc.nextInt();
//                System.out.print(board[i][j]);
            }
//            System.out.println();
        }
//        System.out.println();
        int m = sc.nextInt();
        int[] move = new int[m];
//        System.out.println(m);
        for(int i = 0;i<m;i++) {
            move[i] = sc.nextInt();
//            System.out.print(move[i]+" ");
        }

        System.out.print(T.solution(n,m,board,move));
    }
}
