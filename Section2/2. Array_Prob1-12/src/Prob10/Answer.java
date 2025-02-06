package Prob10;

import java.util.Scanner;

public class Answer {
    int[] dx = {-1,0,1,0};
    int[] dy = {0,1,0,-1};
    public int solution(int n, int[][] arr) {
        int answer = 0;
        int nx, ny;
        for(int i = 0; i<n; i++) {
            for(int j = 0;j<n;j++) {
                boolean flag = true;
                for(int k = 0;k<4;k++) {
                    nx = i + dx[k];
                    ny = j + dy[k];
                    if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny] > arr[i][j]) flag = false;
                }
                if(flag) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Answer T = new Answer();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for(int i = 0; i<n ; i++) {
            for(int j = 0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print(T.solution(n, arr));
    }
}
