package Prob9;

import java.util.*;

public class Prac {
    public int count(int capacity, int[] arr) {
        int count = 1;
        int sum = 0;
        for(int x : arr) {
            if(sum + x > capacity) {
                count++;
                sum = x;
            } else sum += x;
        }

        return count;
    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int[] tmp = arr.clone();
        Arrays.sort(tmp);
//        Arrays.sort(arr);
//        int lt = Arrays.stream(arr).max().getAsInt();
//        int rt = Arrays.stream(arr).sum();
        int lt = tmp[n-1];
        int rt = 0;
        for(int i = 0;i<n;i++) rt += arr[i];

        while(lt<=rt) {
            int mid = (lt+rt) / 2;
            if(count(mid, arr) <= m) {
                answer = mid;
                rt = mid - 1;
            } else lt = mid + 1;

        }

        return answer;
    }

    public static void main(String[] args) {
        Prac T = new Prac();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<n;i++) arr[i] = sc.nextInt();

        System.out.print(T.solution(n,m,arr));
    }
}
