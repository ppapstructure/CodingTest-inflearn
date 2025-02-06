package Prob9;

import java.util.*;

public class Main {
    public int solution(int[][] arr, int n) {
        int max = Integer.MIN_VALUE;

        // 각 열의 합
        for(int i = 0;i < n;i ++) {
            int tmp = 0;

            for(int j = 0;j<n;j++) {
                tmp += arr[i][j];
            }

            if(max < tmp) max = tmp;
        }
        // 각 행의 합
        for(int j = 0;j<n;j++) {
            int tmp = 0;
            for(int i = 0;i<n;i++) {
                tmp += arr[i][j];
            }
            if(max < tmp) max = tmp;
        }

        // 두 대각선의 합
        int tmp2 = 0;
        for(int i = 0;i<n;i++) {
            tmp2 += arr[i][i];
        }

        if(max < tmp2) max = tmp2;

        tmp2 = 0;
        for(int i = n-1;i>=0;i--) {
            tmp2 += arr[i][i];
        }

        if(max < tmp2) max = tmp2;


        return max;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for(int i = 0;i<n;i++) {
            for(int j = 0;j<n;j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print(T.solution(arr, n));
    }
}
