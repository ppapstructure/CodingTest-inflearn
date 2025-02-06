package Prob10;

import java.util.*;

public class Main {
    public boolean Precision(int[][] arr, int p,int i, int j) {
        if(p>arr[i+1][j] && p>arr[i-1][j] && p>arr[i][j-1] && p>arr[i][j+1]) {
            return true;
        }
        return false;
    }

    public int solution(int n, int[][] arr) {
        int cnt = 0;

        for(int i = 1; i < n+1;i++) {
            for(int j = 1;j<n+1;j++) {
                if(Precision(arr,arr[i][j],i,j)) cnt++;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n+2][n+2];

        for(int i = 1; i<n+1 ; i++ ) {
            for(int j = 1; j<n+1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print(T.solution(n, arr));
    }
}
