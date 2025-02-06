package Prob9;

import java.util.*;

public class Answer {


    public int solution(int[][] arr, int n) {
        int max = Integer.MIN_VALUE;

        int sum1, sum2;

        for(int i = 0;i<n;i++) {
            sum1 = sum2 = 0;
            for(int j = 0;j<n;j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            max = Math.max(max, sum1);
            max = Math.max(max, sum2);
        }

        sum1 = sum2 = 0;
        for(int i = 0;i<n;i++) {
            sum1 += arr[i][i];
            sum2 += arr[n-i-1][n-i-1];
        }
        max = Math.max(max, sum1);
        max = Math.max(max, sum2);

        return max;
    }

    public static void main(String[] args) {
        Answer T = new Answer();
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
