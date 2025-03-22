package Prob9;

import java.util.*;

public class Main {
    public int count(int[] arr, int capacity) {
        int count = 1;
        int sum = 0;
        for(int x : arr) {
            if(sum+x>capacity) {
                count++;
                sum = x;
            } else{
                sum += x;
            }
        }

        return count;
    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        // lt는 최댓값
        int lt = Arrays.stream(arr).max().getAsInt();
        // rt는 모든 수의 합
        int rt = Arrays.stream(arr).sum();

        while(lt<=rt) {
            int mid = (lt+rt) / 2;
            if(count(arr,mid)<=m) {
                answer = mid;
                rt = mid - 1;
            }
            else lt = mid + 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<n;i++) arr[i] = sc.nextInt();

        System.out.print(T.solution(n,m,arr));

    }
}
