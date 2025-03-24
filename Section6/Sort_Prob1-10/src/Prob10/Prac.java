package Prob10;

import java.util.*;

public class Prac {
    public int count(int dist, int[] arr) {
        int cnt = 1;
        int ep = arr[0];
        for(int x : arr) {
            if(x - ep >= dist) {
                cnt++;
                ep = x;
            }
        }

        return cnt;
    }

    public int solution(int n, int c, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n-1];

        while(lt<=rt) {
            int mid = (lt+rt) / 2;
            if(count(mid,arr) >= c) {
                answer = mid;
                lt = mid + 1;
            } else rt = mid - 1;

        }

        return answer;
    }

    public static void main(String[] args) {
        Prac T = new Prac();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++) arr[i] = sc.nextInt();

        System.out.print(T.solution(n,c,arr));
    }
}
