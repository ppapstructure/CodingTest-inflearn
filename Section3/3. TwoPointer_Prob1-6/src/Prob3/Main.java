package Prob3;

import java.util.*;

public class Main {
    public int solution(int n, int m, int[]arr) {
        int sum = 0;
        int maxSum = 0;

        for(int i = 0;i<m;i++) {
            sum += arr[i];
        }
        maxSum = sum;
        for(int i = m;i<n;i++) {
            sum = sum - arr[i-m] + arr[i];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
//    public int solution(int n, int m, int[]arr) {
//        int max = -1;
//
//        for(int i = 0;i<=n-m;i++) {
//            int tmp = 0;
//            for(int j = 0+i;j<m+i;j++) {
//                tmp += arr[j];
//            }
//            max = Math.max(max,tmp);
//        }
//
//        return max;
//    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(T.solution(n,m,arr));

    }
}
