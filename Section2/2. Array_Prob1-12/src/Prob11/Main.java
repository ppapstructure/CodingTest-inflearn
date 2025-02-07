package Prob11;

import java.util.*;

public class Main {
    public int solution(int n, int[][] arr) {
        int max = Integer.MIN_VALUE;
        int idx = -1;

        for(int i = 1;i<n+1;i++) {
            int cnt = 0;
            for(int j = 1; j<n+1 ; j++) {
                for(int k = 1; k<6 ; k++) {
                    if(arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }

            if(max<cnt) {
                max = cnt;
                idx = i;
            }
        }

        return idx;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][6];

        for(int i = 1;i<n+1;i++) {
            for(int j = 1;j<6;j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print(T.solution(n,arr));

    }
}
