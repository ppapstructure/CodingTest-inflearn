package Prob12;

import java.util.*;

public class Main {
    public int solution(int n, int m, int[][] arr) {
        int answer = 0;

        for(int i = 1;i<=n;i++) {
            for(int j = 1;j<=n;j++) {
                int cnt = 0;
                // 배열을 순회하면서 (i,j)를 찾은 후, i,j에 해당하는 등수를 pi,pj에 저장.
                for(int k = 0;k<m;k++) {
                    int pi = 0;
                    int pj = 0;
                    for(int s = 0;s<n;s++) {
                        if(arr[k][s] == i) pi = s;
                        if(arr[k][s] == j) pj = s;
                    }
                    if(pi<pj) cnt++;
                }
                if(cnt == m) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][n];

        for(int i = 0;i<m;i++) {
            for(int j = 0;j<n;j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print(T.solution(n,m,arr));
    }
}
